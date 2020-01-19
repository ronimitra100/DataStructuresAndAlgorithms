package practice;

/**
 * Created by ronim_000 on 7/26/2019.
 */
public class LinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node head;

    public void addFront(int data) {
        Node newNode = new Node(data);

        if (head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addBack(int data){
        Node newNode = new Node(data);

        if (head==null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

    }

    public int getFirst(){
        if (head==null){
            throw new IllegalStateException("Empty List");
        }
        return head.data;
    }

    public int getLast(){
        if (head==null){
            throw new IllegalStateException("Empty List");
        }

        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }

        return currentNode.data;

    }

    public int size(){
        if (head==null){
            return 0;
        }

        int count = 1;
        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
            count++;
        }
        return count;
    }

    public void print(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("");

    }

    public void clear(){
        head = null;
    }

    public void deleteValue(int data){
        if (head==null){
            return;
        }

        if (head.data==data){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next!=null){
            if (current.data==data){
                current.next =current.next.next;
                return;
            }

            current = current.next;
        }

    }
}

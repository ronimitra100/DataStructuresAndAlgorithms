package extra;

/**
 * Created by ronim_000 on 10/26/2019.
 */
public class Queue {
    public static class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();
        System.out.println("Is queue empty: " + q.isEmpty());
        System.out.println("Size of queue: " + q.size());
        q.enqueue(1);
        System.out.println("Is queue empty: " + q.isEmpty());
        System.out.println("Size of queue: " + q.size());
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(5);
        q.enqueue(5);
        q.print();
        System.out.println("Sneek peek :" + q.peek());
        q.dequeue();
        q.print();
        System.out.println("Sneek peek :" + q.peek());
        System.out.println("Size of queue: " + q.size());

    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head==null;
    }

    public int peek(){
        return head.data;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if (tail!=null){
            tail.next=node;
        }
        tail=node;
        if (head==null){
            head = node;
            return;
        }
    }

    public int dequeue(){
        int data = head.data;
        head=head.next;
        if (head==null){
            tail=null;
        }
        return data;
    }

    public int size(){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void print(){
        Node current=head;
        while (current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println("");
    }
}

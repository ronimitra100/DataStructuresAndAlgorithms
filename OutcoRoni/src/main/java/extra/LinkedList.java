package extra;

/**
 * Created by ronim_000 on 10/26/2019.
 */
public class LinkedList {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args){
        LinkedList l=new LinkedList();
        l.append(5);
        l.append(-3);
        l.append(10);
        l.append(1);
        l.print();

        l.prepend(20);
        l.print();

        l.delete(-3);
        l.print();

        l.delete(6);
        l.print();

        l.delete(20);
        l.print();
    }

    Node head;

    public void append(int data){
       if (head==null){
           head = new Node(data);
           return;
       }
       Node current = head;
       while(current.next!=null){
           current=current.next;
       }
       current.next=new Node(data);
    }

    public void prepend(int data){
        Node newHead= new Node(data);
        newHead.next=head;
        head=newHead;
    }

    public void delete(int data){
        if (head==null){
            return;
        }
        if (head.data==data){
            head=head.next;
            return;
        }
        Node current = head;
        while(current.next!=null){
            if (current.next.data==data){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }

    public void print(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println("");
    }
}

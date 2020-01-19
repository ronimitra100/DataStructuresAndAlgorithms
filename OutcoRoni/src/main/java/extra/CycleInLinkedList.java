package extra;

import java.util.LinkedList;

/**
 * Created by ronim_000 on 10/26/2019.
 */
public class CycleInLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        java.util.LinkedList l = new LinkedList();
        l.add(n1);
        l.add(n2);
        l.add(n3);
        l.add(n4);
        l.add(n2);
        l.add(n5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        //n2.next=n5;

        CycleInLinkedList c = new CycleInLinkedList();
        System.out.println(c.hasCycle(n1));
    }
    public boolean hasCycle(Node head){
        if (head==null || head.next==null){
            return false;
        }

        Node slow=head;
        Node fast=head.next;

        while(slow!=null && fast!=null && fast.next!=null){
            if (slow==fast){
                return true;
            }
            else{
                slow=slow.next;
                fast=fast.next.next;
            }
        }

        return false;
    }

}

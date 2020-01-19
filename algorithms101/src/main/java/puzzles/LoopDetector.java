package puzzles;

/**
 * Created by ronim_000 on 8/4/2019.
 */
public class LoopDetector {

    private class Node {
        int data;
        Node next;

        public Node(){
            this.data=data;
        }
    }

    public Node head;

    public boolean hasLoop(){
        return hasLoop(head);
    }

    boolean hasLoop(Node first){
        Node slow=first;
        Node fast=first;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast){
                return true;
            }
        }

        return false;
    }


}

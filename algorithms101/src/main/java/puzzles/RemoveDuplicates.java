package puzzles;

//import challenges.linkedLists.Node;

import java.util.HashSet;

/**
 * Created by ronim_000 on 8/3/2019.
 */
public class RemoveDuplicates {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node head;

    public void removeDups(Node current){
        HashSet<Integer> uniques = new HashSet<>();
        Node previous= null;

        while(current!=null){
            if (uniques.contains(current.data)){
                previous.next = current.next;
            }
            else{
                uniques.add(current.data);
                previous=current;
            }
            current = current.next;
        }

    }
}

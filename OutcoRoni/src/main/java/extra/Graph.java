package extra;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by ronim_000 on 11/11/2019.
 */
public class Graph {
    private HashMap<Integer,Node> nodeLookup = new HashMap<Integer,Node>();

    public static class Node{
        private int id;
        java.util.LinkedList<Node> adjacent = new java.util.LinkedList<Node>();
        private Node(int id){
            this.id=id;
        }
    }

    private Node getNode(int id){
        Node node = new Node(id);
        return node;
    }

    public void addEdge(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    public boolean hasPathDFS(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<Integer>() ;

        return hasPathDFS(s, d ,visited);
    }

    public boolean hasPathBFS(Node source, Node destination){
        java.util.LinkedList<Node> nextToVisit = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet<Integer>();
        nextToVisit.add(source);

        while (!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();

            if (visited.contains(node)){
                continue;
            }

            if (source==destination){
                return true;
            }

            visited.add(node.id);

            for (Node child : node.adjacent){
                nextToVisit.add(child);
            }
        }


        return false;
    }

    public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
        if (visited.contains(source.id)) {
            return false;
        }

        if (source==destination){
            return true;
        }
        visited.add(source.id);

        for (Node childNode : source.adjacent){
            if (hasPathDFS(childNode, destination, visited)){
                return true;
            }
        }
        return false;
    }


}

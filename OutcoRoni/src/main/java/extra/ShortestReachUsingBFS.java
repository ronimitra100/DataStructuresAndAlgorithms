package extra;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by ronim_000 on 11/14/2019.
 */
public class ShortestReachUsingBFS {
    private Node[] nodes;
    private static int EDGE_DISTANCE;

    public ShortestReachUsingBFS(int size){
        for (int i=0; i<size; i++){
            nodes[i] = new Node(i);
        }
    }
    public static class Node{
        int id;
        java.util.LinkedList<Integer> neighbors = new LinkedList<>();

        public Node(int id){
            this.id=id;
        }
    }

    public Node getNode(int i){
        Node node = new Node(i);
        return node;
    }

    public void addEdge(int first, int second){
        Node f = new Node(first);
        f.neighbors.add(second);
    }

    public int[] shortestReach(int startId){
        int[] distances = new int[nodes.length];
        Arrays.fill(distances, -1);
        distances[startId]=0;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(startId);

        while (!queue.isEmpty()){
            int node = queue.poll();
            for (int neightbor : nodes[node].neighbors){
                if (distances[neightbor]==-1){
                    queue.add(neightbor);
                    distances[neightbor] = distances[node] + EDGE_DISTANCE;
                }
            }
        }

        return distances;
    }


}

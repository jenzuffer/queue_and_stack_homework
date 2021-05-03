package Algorithm;

import Edges.Edge;
import Graphs.Graph;

import java.util.PriorityQueue;

public class AStarAlgorithm {

    private Graph graph;
    private int startNode;
    private int targetNode;
    private Heuristic heuristic;


    int[] pathArray;
    double[] bestWeight;
    private PriorityQueue pq = new PriorityQueue();

    public AStarAlgorithm(AstarProblem astarProblem) {
        this.graph = astarProblem.getGraph();
        this.startNode = astarProblem.getStartNode();
        this.targetNode = astarProblem.getTargetNode();
        this.heuristic = astarProblem.getHeuristic();


        int curNode = startNode;
        pq.add(startNode);

        while (!pq.isEmpty()) {
            pq.remove(curNode);
            double currentCost = bestWeight[curNode];
            for (Edge e : graph.adj(curNode)) {
                double cost =  currentCost + e.Weight();
                int toNode = e.from();
                if (cost < bestWeight[toNode]) {
                    bestWeight[toNode] = cost;
                    pathArray[toNode]= curNode;
                }
                if(!pq.contains(toNode))
                    pq.add(toNode);
            }
            curNode = (int) pq.poll();


        }

    }


}

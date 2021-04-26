package Algorithm;

import Edges.DirectedEdge;
import Edges.EdgeWeightedDigraph;
import Queues.MinPQ;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Dijkstra2 {
    int[] pathArray;
    double[] bestWeight;
    private PriorityQueue pq;

    public Dijkstra2(EdgeWeightedDigraph g, int startNode) {
        pathArray = new int[g.V()];
        for (int i = 0; i < pathArray.length; i++) {
            pathArray[i] = -1;
        }
        bestWeight = new double[g.V()];
        for (int i = 0; i < bestWeight.length; i++) {
            bestWeight[i] = Double.MAX_VALUE;
        }
        int curNode = startNode;
        pathArray[startNode] = -1;
        bestWeight[startNode] = 0;

        pq = new PriorityQueue();

        pq.add(startNode);

        while (!pq.isEmpty()) {
            pq.remove(curNode);
            double currentCost = bestWeight[curNode];
            for (DirectedEdge e : g.adj(curNode)) {
                double cost =  currentCost + e.weight();
                int toNode = e.to();
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


    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("best weights:\n");
        for (int i = 0; i < bestWeight.length; i++) {
            res.append(i);
            res.append(": ");
            res.append(bestWeight[i]);
            res.append("\n");
        }

        res.append("path parents:\n");
        for (int i = 0; i < bestWeight.length; i++) {
            res.append(i);
            res.append(": ");
            res.append(pathArray[i]);
            res.append("\n");
        }

        return res.toString();
    }
}

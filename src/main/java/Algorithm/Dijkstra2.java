package Algorithm;

import Edges.DirectedEdge;
import Edges.EdgeWeightedDigraph;
import Queues.MinPQ;

import java.util.Comparator;
import java.util.Iterator;

public class Dijkstra2 {
    int[] pathArray;
    float[] bestWeight;
    private MinPQ minPQ;

    public Dijkstra2(EdgeWeightedDigraph g, int startNode) {
        pathArray = new int[g.V()];
        for (int i = 0; i < pathArray.length; i++) {
            pathArray[i] = -1;
        }
        bestWeight = new float[g.V()];
        for (int i = 0; i < bestWeight.length; i++) {
            bestWeight[i] = Float.MAX_VALUE;
        }
        int curNode = startNode;

        minPQ = new MinPQ();



        while (curNode != -1) {
            float currentCost = bestWeight[curNode];
            for (DirectedEdge e : g.adj(curNode)) {
                float cost = (float) (currentCost + e.weight());
                int toNode = e.to();
                if (cost < bestWeight[toNode]) {
                    bestWeight[toNode] = cost;
                }
                minPQ.insert(toNode);
            }
            //curNode = minPQ.delMin();
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

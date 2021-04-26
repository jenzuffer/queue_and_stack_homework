package Algorithm;

import Edges.EdgeImpl2;
import Graphs.EdgeWeightedGraph2;

import java.util.ArrayList;

import static java.lang.Double.NaN;

public class Dijkstra {

    private ArrayList verticeQ[];
    private double[] distTo;


    public Dijkstra(EdgeWeightedGraph2 graph, int source) {
        int v = graph.V();
        verticeQ = new ArrayList[v];
        int iterator = 0;
        for (EdgeImpl2 graphs : graph.adj(source)) {
            verticeQ[iterator].add(Double.POSITIVE_INFINITY);
            verticeQ[iterator].add(NaN);
            iterator++;
        }
        verticeQ[source].add(0);
        verticeQ[source].add(-1);

        while (verticeQ.length > 0){

        }
    }


}

package Algorithm;

import Edges.DirectedEdge;
import Edges.EdgeImpl2;
import Edges.EdgeWeightedDigraph;
import Graphs.EdgeWeightedGraph2;
import Queues.IndexMinPQ;

import java.util.ArrayList;

import static java.lang.Double.NaN;

public class Dijkstra {

    private IndexMinPQ Q;
    private double[] distTo;
    private int[] prev;


    public Dijkstra(EdgeWeightedDigraph graph, int source) {
        int v = graph.V();
        distTo = new double[v];
        prev = new int[
                v];

        int iterator = 0;
        for (DirectedEdge graphs : graph.edges()) {
            distTo[iterator] = Double.POSITIVE_INFINITY;
            prev[iterator] = -1;
            Q.insert(graphs.from());
            iterator++;

        }
        distTo[source] = 0;
        prev[source] = -1;

        while (!Q.isEmpty()) {
            int i = Q.delMinEager();
            Q.delete(i);
            for (var vert : graph.adj(i)
            ) {

            }


        }
    }


}

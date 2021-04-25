package custom;

import Algorithm.KruskalMST;
import Algorithm.LazyPrimMST2;
import Algorithm.LazyPrimMst;
import Edges.Edge;
import Edges.EdgeImpl;
import Edges.EdgeImpl2;
import Graphs.EdgeWeightedGraph;
import Algorithm.EagerPrimMST;
import Graphs.EdgeWeightedGraph2;

public class Main {
    public static void main(String[] args) {
        // Create a stack and push/pop strings as directed on StdIn.
        /*
        custom.Stack<Integer> s = new custom.Stack<Integer>();
        for (int index = 0; index < 10; index++) {
            s.push(index);
        }
        Iterator<Integer> iterator = s.iterator();
        for (Iterator<Integer> it = iterator; it.hasNext(); ) {
            Integer i = it.next();
            System.out.println(i);
        }
        Queues.QueueImpl<Integer> s1 = new Queues.QueueImpl<Integer>();
        for (int index = 0; index < 10; index++) {
            s1.enqueue(index);
        }
        while (!s1.isEmpty()) {
            Integer dequeue = s1.dequeue();
            System.out.println(dequeue);
        }
                 */
        /*
        EdgeWeightedGraph edgeWeightedGraph = new EdgeWeightedGraph(7);

        Edge e = new EdgeImpl(0, 1, 1);
        Edge e2 = new EdgeImpl(1, 2, 2);
        Edge e3 = new EdgeImpl(1, 5, 3);
        Edge e4 = new EdgeImpl(2, 5, 4);
        Edge e5 = new EdgeImpl(1, 4, 5);
        Edge e6 = new EdgeImpl(4, 5, 6);
        Edge e7 = new EdgeImpl(5, 6, 7);
        Edge e8 = new EdgeImpl(4, 6, 8);
        Edge e9 = new EdgeImpl(3, 6, 9);
        Edge e10 = new EdgeImpl(3, 4, 10);
        Edge e11 = new EdgeImpl(0, 4, 11);
        Edge e12 = new EdgeImpl(0, 3, 12);

        edgeWeightedGraph.addEdge(e);
        edgeWeightedGraph.addEdge(e2);
        edgeWeightedGraph.addEdge(e3);
        edgeWeightedGraph.addEdge(e4);
        edgeWeightedGraph.addEdge(e5);
        edgeWeightedGraph.addEdge(e6);
        edgeWeightedGraph.addEdge(e7);
        edgeWeightedGraph.addEdge(e8);
        edgeWeightedGraph.addEdge(e9);
        edgeWeightedGraph.addEdge(e10);
        edgeWeightedGraph.addEdge(e11);
        edgeWeightedGraph.addEdge(e12);
         */

        EdgeWeightedGraph2 edgeWeightedGraph = new EdgeWeightedGraph2(7);

        EdgeImpl2 e = new EdgeImpl2(0, 1, 1);
        EdgeImpl2 e2 = new EdgeImpl2(1, 2, 2);
        EdgeImpl2 e3 = new EdgeImpl2(1, 5, 3);
        EdgeImpl2 e4 = new EdgeImpl2(2, 5, 4);
        EdgeImpl2 e5 = new EdgeImpl2(1, 4, 5);
        EdgeImpl2 e6 = new EdgeImpl2(4, 5, 6);
        EdgeImpl2 e7 = new EdgeImpl2(5, 6, 7);
        EdgeImpl2 e8 = new EdgeImpl2(4, 6, 8);
        EdgeImpl2 e9 = new EdgeImpl2(3, 6, 9);
        EdgeImpl2 e10 = new EdgeImpl2(3, 4, 10);
        EdgeImpl2 e11 = new EdgeImpl2(0, 4, 11);
        EdgeImpl2 e12 = new EdgeImpl2(0, 3, 12);

        edgeWeightedGraph.addEdge(e);
        edgeWeightedGraph.addEdge(e2);
        edgeWeightedGraph.addEdge(e3);
        edgeWeightedGraph.addEdge(e4);
        edgeWeightedGraph.addEdge(e5);
        edgeWeightedGraph.addEdge(e6);
        edgeWeightedGraph.addEdge(e7);
        edgeWeightedGraph.addEdge(e8);
        edgeWeightedGraph.addEdge(e9);
        edgeWeightedGraph.addEdge(e10);
        edgeWeightedGraph.addEdge(e11);
        edgeWeightedGraph.addEdge(e12);

        /*
        //LazyPrimMst lazyPrimMst = new LazyPrimMst(edgeWeightedGraph);
        //EagerPrimMST eagerPrimMST = new EagerPrimMST(edgeWeightedGraph);

        LazyPrimMST2 lazyPrimMST2 = new LazyPrimMST2(edgeWeightedGraph);
        for (EdgeImpl2 edge : lazyPrimMST2.edges()) {
            StdOut.println(edge);
        }
        StdOut.println(lazyPrimMST2.weight());
        */
        KruskalMST kruskalMST = new KruskalMST(edgeWeightedGraph);
        for (EdgeImpl2 edge : kruskalMST.edges()){
            StdOut.println(edge);
        }
        StdOut.println(kruskalMST.weight());
    }
}

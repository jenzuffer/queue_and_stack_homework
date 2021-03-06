package custom;

import Algorithm.*;
import Edges.*;
import Graphs.EdgeWeightedGraph;
import Graphs.EdgeWeightedGraph2;
import Graphs.Graph;
import Graphs.GraphImplementation;

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

        /*
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
      /*  KruskalMST kruskalMST = new KruskalMST(edgeWeightedGraph);
        for (EdgeImpl2 edge : kruskalMST.edges()){
            StdOut.println(edge);
        }
       StdOut.println(kruskalMST.weight());*/
        //Dijkstra k = new Dijkstra(ed , 0);
        var edgeWeightedGraph = new EdgeWeightedDigraph(8);

        DirectedEdge e = new DirectedEdge(0, 1, 2);
        DirectedEdge e2 = new DirectedEdge(1, 2, 1);
        DirectedEdge e3 = new DirectedEdge(0, 3, 3);
        DirectedEdge e4 = new DirectedEdge(0, 4, 8);
        DirectedEdge e5 = new DirectedEdge(2, 4, 1);
        DirectedEdge e6 = new DirectedEdge(2, 5, 1);
        DirectedEdge e7 = new DirectedEdge(3, 4, 1);
        DirectedEdge e8 = new DirectedEdge(4, 5, 3);
        DirectedEdge e9 = new DirectedEdge(3, 6, 5);
        DirectedEdge e10 = new DirectedEdge(4, 6, 2);
        DirectedEdge e11 = new DirectedEdge(7, 4, 2);
        DirectedEdge e12 = new DirectedEdge(5, 7, 1);
        DirectedEdge e13 = new DirectedEdge(6, 7, 1);
        DirectedEdge e14 = new DirectedEdge(1, 4, 2);

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
        edgeWeightedGraph.addEdge(e14);
        edgeWeightedGraph.addEdge(e13);
/*
        EdgeWeightedDigraph factory = new EdgeWeightedDigraph(edgeWeightedGraph);
        Dijkstra2 dijkstra2 = new Dijkstra2(factory, 0);

        System.out.println(dijkstra2);
*/

        Heuristicclass heuristicclass = new Heuristicclass();
        Graph graph = new GraphImplementation();

        AstarProblem aproblem = new Aproblem(graph, 0, 5, heuristicclass);

        AStarAlgorithm aStarAlgorithm = new AStarAlgorithm(aproblem);

    }
}

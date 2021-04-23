package custom;

import Edges.Edge;
import Edges.EdgeImpl;
import Graphs.EdgeWeightedGraph;
import Queues.EagerPrimMST;

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

        //LazyPrimMst lazyPrimMst = new LazyPrimMst(edgeWeightedGraph);
        EagerPrimMST eagerPrimMST = new EagerPrimMST(edgeWeightedGraph);
        for (Edge edge : eagerPrimMST.edges()) {
            int either = edge.either();
            int other = edge.other(0);
            System.out.println(either + " either" + " " + other + " other");
        }
    }
}

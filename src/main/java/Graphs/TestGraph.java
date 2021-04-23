package Graphs;

import java.io.IOException;

public class TestGraph {
    public static void main(String[] args) {
        try {
            Graph graph = new GraphImplementation("E:\\software-udvikling-anden-semester\\queue_and_stack_homework\\graph1.txt");
            graph.adj(0);
            Graph graph1 = new GraphImplementation(10);
            graph1.addEdge(0, 1);
            graph1.addEdge(1, 2);
            graph1.addEdge(2, 3);
            graph1.addEdge(3, 4);
            graph1.addEdge(4, 5);
            graph1.addEdge(5, 6);
            graph1.addEdge(6, 7);
            graph.adj(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

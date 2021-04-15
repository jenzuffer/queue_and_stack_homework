import java.io.IOException;

public class TestGraph {
    public static void main(String[] args) {
        try {
            Graph graph = new GraphImplementation("E:\\software-udvikling-anden-semester\\queue_and_stack_homework\\graph1.txt");
            for (Integer index : graph.adj(0)) {
                System.out.println(index);
            }
            Graph graph1 = new GraphImplementation(10);
            graph1.addEdge(0, 1);
            graph1.addEdge(1, 2);
            graph1.addEdge(2, 3);
            graph1.addEdge(3, 4);
            graph1.addEdge(4, 5);
            graph1.addEdge(5, 6);
            graph1.addEdge(6, 7);
            for (Integer index : graph1.adj(0)) {
                System.out.println(index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.ArrayList;

public class GraphImplementation implements Graph {

    private int edgecount;
    private static final ArrayList<Integer> emptylist = new ArrayList<Integer>(0);
    private ArrayList<Integer>[] graph;

    public GraphImplementation() {
    }

    public GraphImplementation(int verticeCount) {
        graph = new ArrayList[verticeCount];
        edgecount = 0;
    }

    public GraphImplementation(String fileanme) throws IOException {
        InputStream in = new FileInputStream(fileanme);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line = br.readLine();
            int v = Integer.parseInt(line);
            graph = new ArrayList[v];
            System.out.println("graphs length: " + graph.length);
            edgecount = 0;
            line = br.readLine();

            int e = Integer.parseInt(line);
            System.out.println(line);
            for (int i = 0; i < e; ++i) {
                line = br.readLine();
                //System.out.println(line);
                String[] vs = line.split(" ");
                int vertex1 = Integer.parseInt(vs[0]);
                int vertex2 = Integer.parseInt(vs[1]);
                addEdge(vertex1, vertex2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int getV() {
        return graph.length;
    }

    public int getE() {
        return edgecount;
    }

    public void addEdge(int vertice1, int vertice2) {
        System.out.println(vertice1);
        ArrayList<Integer> arr = graph[vertice1];
        if (arr == null) {
            arr = new ArrayList<>();
            graph[vertice1] = arr;
        }
        arr.add(vertice2);
        ++edgecount;
    }

    public void adj(int vertex) {
        for (int index = vertex; index < graph.length; index++) {
            ArrayList<Integer> integers = graph[index];
            if (integers == null) continue;
            for (Integer integer : integers) {
                System.out.println(integer + "adj");
            }
        }
    }


}

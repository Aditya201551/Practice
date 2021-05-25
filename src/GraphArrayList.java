//Graph using ArrayList and HashSet

import java.util.*;
public class GraphArrayList {

    void addEdge(ArrayList<HashSet<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void deleteEdge(ArrayList<HashSet<Integer>> graph, int u, int v) {
        if (graph.isEmpty()) {
            System.out.println("Graph is empty!");
            return;
        }
//        System.out.println(graph.get(u));
//        System.out.println(graph.get(v));
        graph.get(u).remove(v);
        graph.get(v).remove(u);
    }

    void addVertex(ArrayList<HashSet<Integer>> graph) {
        graph.add(new HashSet<Integer>());

    }

    //This function is working fine but during printing the remaining vertex is taking the deleted vertex's place
    void deleteVertex(ArrayList<HashSet<Integer>> graph, int vertex) {
        if (vertex > graph.size() || vertex < 0) {
            System.out.println("Vertex you want to delete does not exist: enter the index of the vertex(starting from 0)");
            return;
        }
        int i = 0;
        while (i != vertex)
            i++;
//        System.out.println(i);
        graph.remove(i);
        for (HashSet<Integer> set : graph) {
            if (set.contains(vertex)) {
                set.remove(vertex);
                break;
            }
        }
    }

    void printGraph(ArrayList<HashSet<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + "->");
            Iterator<Integer> j = graph.get(i).iterator();
            while (j.hasNext()) {
                System.out.print(", " + j.next());
            }
            System.out.println();
        }
        System.out.println("_________________________________");
    }

    public static void main(String[] args) {
        GraphArrayList ob = new GraphArrayList();
        ArrayList<HashSet<Integer>> graph = new ArrayList<>();
        int[][] node = {{0, 1}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {3, 4}};
        int numberOFNodes = 5;
        //initializing empty ArrayList with empty nested HashSet inside
        for (int i = 0; i < numberOFNodes; i++)
            ob.addVertex(graph);

        for (int[] i : node)
            ob.addEdge(graph, i[0], i[1]);

        ob.printGraph(graph);
        ob.addEdge(graph, 1, 4);
        ob.deleteEdge(graph, 1, 4);
//        ob.addVertex(graph);
        ob.deleteVertex(graph, 1);
        ob.printGraph(graph);
    }
}
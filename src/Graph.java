//Graph using ArrayList and HashSet

import java.util.*;
public class Graph {

    void addEdge(ArrayList<HashSet<Integer>> graph,int u, int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void deleteEdge(ArrayList<HashSet<Integer>> graph, int u, int v)
    {
        if(graph.isEmpty())
        {
            System.out.println("Graph is empty!");
            return;
        }
//        System.out.println(graph.get(u));
//        System.out.println(graph.get(v));
        graph.get(u).remove(new Integer(v));
        graph.get(v).remove(new Integer(u));
    }

    void printGraph(ArrayList<HashSet<Integer>> graph)
    {
       for(int i=0;i<graph.size();i++)
       {
           System.out.print(i+"->");
           Iterator<Integer> j = graph.get(i).iterator();
           while(j.hasNext()) {
               System.out.print(", " + j.next());
           }
           System.out.println();
       }
       System.out.println("_________________________________");
    }

    public static void main(String[] args)
    {
        Graph ob=new Graph();
        ArrayList<HashSet<Integer>> graph= new ArrayList<>();
        int[][] node ={{0,1},{0,4},{1,2},{1,3},{1,4},{2,3},{3,4}};
        int numberOFNodes=5;

        //initializing empty ArrayList with empty nested ArrayList inside it
        for(int i=0;i<numberOFNodes;i++)
            graph.add(new HashSet<Integer>());

        for(int[] i :node)
            ob.addEdge(graph,i[0],i[1]);

        ob.printGraph(graph);
        ob.addEdge(graph,1,4);
        ob.deleteEdge(graph,1,4);
        ob.printGraph(graph);
    }
}

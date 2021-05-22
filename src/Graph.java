import java.util.*;
public class Graph {

    void addEdge(ArrayList<ArrayList<Integer>> graph,int u, int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void printGraph(ArrayList<ArrayList<Integer>> graph)
    {
       for(int i=0;i<graph.size();i++)
       {
           System.out.print(i);
           for(int j=0;j<graph.get(i).size();j++)
               System.out.print("-> "+graph.get(i).get(j));
           System.out.println();
       }
    }

    public static void main(String[] args)
    {
        Graph ob=new Graph();
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        int[][] node ={{0,1},{0,4},{1,2},{1,3},{1,4},{2,3},{3,4}};
        int numberOFNodes=5;

        //initializing empty ArrayList with empty nested ArrayList inside it
        for(int i=0;i<numberOFNodes;i++)
            graph.add(new ArrayList<Integer>());

        for(int[] i :node)
            ob.addEdge(graph,i[0],i[1]);

        ob.printGraph(graph);
    }
}

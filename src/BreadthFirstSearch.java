import java.util.*;
public class BreadthFirstSearch {
    ArrayList<HashSet<Integer>> graph=new ArrayList<>();

    void addVertex()
    {
        graph.add(new HashSet<>());
    }

    void addEdge(int u, int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void deleteEdge(int u, int v)
    {
        graph.get(u).remove(v);
        graph.get(v).remove(u);
    }

    void printGraph()
    {
        int x=0;
        for(HashSet<Integer> i:graph)
        {
            System.out.print(x++ +" ->");
            Iterator<Integer> j=i.iterator();
            while(j.hasNext())
                System.out.print(j.next()+", ");
            System.out.println();
        }
    }

    void BFS(int s)
    {
        boolean visited[]=new boolean[5];
        visited[s]=true;
        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(s);

        while(queue.size()!=0)
        {
//            System.out.println(queue);
            s=queue.poll();
            System.out.print(s+" ");

            Iterator<Integer> i=graph.get(s).iterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
//                    System.out.println(n+" "+queue);
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[])
    {
        BreadthFirstSearch ob=new BreadthFirstSearch();
        int[][] arr = {{0, 1}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {3, 4}};
        for(int i=0;i<5;i++)
            ob.addVertex();
        for(int i[]:arr)
            ob.addEdge(i[0],i[1]);
        ob.printGraph();
        System.out.println();
        ob.BFS(0);
    }
}
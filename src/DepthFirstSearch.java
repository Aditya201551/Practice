import java.util.*;
public class DepthFirstSearch {
    ArrayList<HashSet<Integer>> graph=new ArrayList<HashSet<Integer>>();

    void addVertex()
    {
        graph.add(new HashSet<Integer>());
    }
    void addEdge(int u, int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void DFS(int v, boolean[] visited)
    {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(v);
        while(!stack.isEmpty())
        {
            v=stack.pop();
            if(!visited[v])
            {
                System.out.print(v+" ");
                visited[v]=true;
                /*for(boolean i:visited)
                    System.out.print(i+" ");*/
            }
            Iterator<Integer> i=graph.get(v).iterator();
//            System.out.println(i.next());
            while(i.hasNext())
            {
                int n=i.next();
//                System.out.println("|"+n+"|");
                if(!visited[n])
                    stack.push(n);
            }
        }
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

    public static void main(String[] args)
    {
        DepthFirstSearch ob=new DepthFirstSearch();
        for(int i=0;i<4;i++)
            ob.addVertex();
        int arr[][]={{0, 1}, {0, 2}, {1, 2}, {2,0}, {2,3}, {3,3}};
        boolean visited[]=new boolean[ob.graph.size()];
        for(int[] i:arr)
            ob.addEdge(i[0],i[1]);
        ob.printGraph();
        System.out.println("__________________________________________");
        ob.DFS(0,visited);
    }
}

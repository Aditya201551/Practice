import java.util.*;

//tree used: BST
public class LCA {

    class Node{
        int data;
        Node right,left;
        Node(int data)
        {
            this.data = data;
            right=left=null;
        }
    }
    Node root=null;
    List<Integer> path1=new <Integer>ArrayList();
    List<Integer> path2=new <Integer>ArrayList();

    //inserting element recursively
    Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            // value already exists
            System.out.println("Duplicate values not allowed!");
            return current;
        }

        return current;
    }

    //adding element iteratively
    Node add(int data)
    {
        Node current=root;
        if(current==null)
            return new Node(data);
        Node par=null;
        while(current!=null) {
            par = current;
            if (data < current.data)
                current = current.left;
            else if (data > current.data)
                current = current.right;
            else {
                System.out.println("Duplicate elements not allowed!");
                return root;
            }
        }
        Node tmp=new Node(data);
        if(data<par.data)
            par.left = tmp;
        else
            par.right = tmp;

        return root;
    }

    //NOTE: Recursion is slower and shittier than iteration
    boolean findPath(Node root, int n, List<Integer> path)
    {
        // base case
        if (root == null) {
            return false;
        }

        // Store this node . The node will be removed if
        // not in path from root to n.
        path.add(root.data);

        if (root.data == n) {
            return true;
        }

        if (root.left != null && findPath(root.left, n, path)) {
            return true;
        }

        if (root.right != null && findPath(root.right, n, path)) {
            return true;
        }

        // If not present in subtree rooted with root, remove root from
        // path[] and return false
        path.remove(path.size()-1);

        return false;
    }

    int findLCA(int n1, int n2)
    {
        path1.clear();
        path2.clear();
        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
            System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
            return -1;
        }

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i)))
                break;
        }

        return path1.get(i-1);
    }


    public static void main(String[] args)
    {
        int[] arr ={8,5,2,4,7,1,9,6,3,10,20,80};
        LCA ob=new LCA();
        for(int i:arr)
            ob.root=ob.add(i);
        System.out.println(ob.findLCA(9,7));
    }

}

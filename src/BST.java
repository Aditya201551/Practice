import java.util.*;

public class BST {

    class Node{
        int data;
        Node left,right;

        Node(int data)
        {
            this.data = data;
            left=right=null;
        }
    }

    Node root=null;

    void add(int data)
    {
        Node tmp,par,ptr;
        ptr=root;
        par=null;
        while(ptr!=null)
        {
            par=ptr;
            if(data<ptr.data)
                ptr=ptr.left;
            else if(data>ptr.data)
                ptr=ptr.right;
            else{
                System.out.println("Duplicate Key!");
                return;
            }
        }
        tmp=new Node(data);
        if(par==null)
            root=tmp;
        else if(data<par.data)
            par.left=tmp;
        else
            par.right=tmp;
    }

    void delete(int data)
    {
        Node par,ptr;
        ptr=root;
        par=null;

        while(ptr!=null)
        {
            if(data==ptr.data)
                break;
            par=ptr;
            if(data<ptr.data)
                ptr=ptr.left;
            else
                ptr=ptr.right;
        }
        if(ptr==null)
        {
            System.out.println("Key not found");
            return;
        }
        else if(ptr.right!=null && ptr.left!=null)
            root=del2childNode(par,ptr);
        else if(ptr.left!=null)
            root=del1child(par,ptr);
        else if(ptr.right!=null)
            root=del1child(par,ptr);
        else
            root=delLeaf(par,ptr); //no child of the node to be deleted|| ptr can also be made null
    }

    Node delLeaf(Node par,Node ptr)
    {
        if(par==null)
            root=null;
        else if(par.right==ptr)
            par.right = null;
        else
            par.left = null;

        return root;
    }

    Node del1child(Node par, Node ptr)
    {
        Node child;
        if(ptr.right!=null)
            child=ptr.right;
        else
            child=ptr.left;

        if(par==null)
            root=child;
        else if(par.right==ptr)
            par.right = child;
        else
            par.left = child;

        return root;
    }

    Node del2childNode(Node par, Node ptr)
    {
        Node succ, parsucc;

        parsucc=ptr;
        succ=ptr.right;

        while(succ.left!=ptr)
        {
            parsucc=succ;
            succ=succ.left;
        }
        ptr.data=succ.data;
        if(succ.left==null&&succ.right==null)
            root=delLeaf(parsucc,succ);
        else
            root=del1child(parsucc,succ);
        return root;
    }

    int[] levelOrderTraversal(Node startNode) {
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(startNode);
        int n=0,arr[];
        List<Integer> l=new LinkedList<Integer>();
        while(!queue.isEmpty())
        {
            Node tempNode=queue.poll();
            l.add(tempNode.data);
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
        arr=new int[l.size()];
        for(int i:l)
            arr[n++]=i;
        return arr;
    }

    boolean search(int data)
    {
        Node tmp=root;
        boolean found=false;
        while (tmp!=null)
        {
            if(tmp.data==data)
            {
                found=true;
                break;
            }
            else if(data<tmp.data)
                tmp=tmp.left;
            else
                tmp=tmp.right;
        }
        return found;
    }

    void printarr(int[] arr)
    {
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        BST ob=new BST();
        int arr[]={50,30,60,38,35,55,22,59,94,13,98};
        for(int i:arr)
            ob.add(i);

        arr=ob.levelOrderTraversal(ob.root);
        ob.printarr(arr);
        ob.delete(38);
        System.out.println();
        arr=ob.levelOrderTraversal(ob.root);
        ob.printarr(arr);

        System.out.println(ob.search(500)?"\nFound success":"\nFound Fail");
    }
}
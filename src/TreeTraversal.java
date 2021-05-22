public class TreeTraversal<E> {

    class TreeNode<E> {
        E data;
        TreeNode<E> left,right;
        TreeNode(E data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    TreeNode<E> root;

    TreeNode insertLevelOrder(int[] arr, TreeNode root, int i)
    {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }
    boolean printLevel(TreeNode root, int level)
    {
        // base case
        if (root == null) {
            return false;
        }

        if (level == 1)
        {
            System.out.print(root.data + " ");
            return true;
        }

        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return left || right;
    }
    void levelOrderTraversal(TreeNode root)
    {
        System.out.print("Level Order: ");

        int level = 1;
        while (printLevel(root, level)) {
            level++;
        }
    }

    void inorder(TreeNode<E> root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    void preorder(TreeNode<E> root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(TreeNode<E> root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args)
    {
        TreeTraversal ob=new TreeTraversal();
        int arr[]={20,12,29,10,15,25,45,11,22,40,66};
        ob.root= ob.insertLevelOrder(arr, ob.root, 0);
        ob.levelOrderTraversal(ob.root);
        System.out.print("\nInorder: ");
        ob.inorder(ob.root);
        System.out.print("\nPreorder: ");
        ob.preorder(ob.root);
        System.out.print("\nPostorder: ");
        ob.postorder(ob.root);
    }
}

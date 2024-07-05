package BST;


public class BSTDemo {
    
  
    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // root.right.right.right = new TreeNode(24);
        // root.right.right.left = new TreeNode(241);
        // Visualize the binary tree
        BST bst = new BST(new TreeNode(8));
        bst.add( 3 );
        bst.add( 10);
        bst.add( 1);
        bst.add( 6 );
        bst.add( 14 );
        bst.add( 4 );
        bst.add( 7 );
        bst.add( 13 );
       
        System.out.println(bst.containsNode(241));
       bst.printTree();
    }
}

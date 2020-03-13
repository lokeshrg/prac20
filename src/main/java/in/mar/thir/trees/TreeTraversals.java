package in.mar.thir.trees;

public class TreeTraversals {
    public static void main(String[] args) {
        System.out.println("Trees");
        TreeNode root = new TreeNode("A");
        root.left = new TreeNode("B");
        root.right = new TreeNode("C");
        root.left.left = new TreeNode("D");
        root.left.right = new TreeNode("E");
        root.right.left = new TreeNode("F");
        root.right.right = new TreeNode("G");
        iotr(root);
        System.out.println("In order traversal");
        pretr(root);
        System.out.println("Pre order traversal");
        postr(root);
        System.out.println("Post order traversal");
    }


    static void iotr(TreeNode root) {
        //traverse left sub tree
        // go to root
        //traverse right sub tree
        if (root != null) {
            iotr(root.left);
            System.out.print(root.val + " => ");
            iotr(root.right);
        }
    }

    static void pretr(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " => ");
            pretr(root.left);
            pretr(root.right);
        }
    }

    static void postr(TreeNode root) {
        if (root != null) {
            postr(root.left);
            postr(root.right);
            System.out.print(root.val + " => ");
        }
    }
}


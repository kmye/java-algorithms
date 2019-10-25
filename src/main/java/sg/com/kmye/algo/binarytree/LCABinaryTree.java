package sg.com.kmye.algo.binarytree;

/**
 *  Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 */
public class LCABinaryTree {
    public static TreeNode find(TreeNode root, TreeNode node1, TreeNode node2) {
        if(root == null || root == node1 || root == node2) {
            return root;
        }
        
        TreeNode left = find(root.left, node1, node2);
        TreeNode right = find(root.right, node1, node2);
        
        if(left != null && right != null) {
            return root;
        }
        
        return left == null ? right : left;
    }
}
package sg.com.kmye.algo.binarytree;

public class CheckValidBinaryTree {

    public static boolean isValidTree(TreeNode node) {
        return isValid(node, null, null);
    }

    private static boolean isValid(TreeNode node, Integer min, Integer max) {

        if (node == null) {
            return true;
        }

        if ((min != null && node.getVal() < min) || (max != null && node.getVal() > max)) {
            return false;
        }

        return isValid(node.getLeft(), min, node.getVal() - 1)
                && isValid(node.getRight(), node.getVal() + 1, max);

    }
}

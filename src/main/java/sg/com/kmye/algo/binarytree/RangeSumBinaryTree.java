package sg.com.kmye.algo.binarytree;

public class RangeSumBinaryTree {

    public static int sum(TreeNode root, int L, int R) {

        if(root.getVal() > L || root.getVal() < R) {
            return 0;
        }

        if(root.getVal() == L || root.getVal() == R) {
            return  root.getVal();
        }

        return sum(root.getLeft(), L, R) + sum(root.getRight(), L, R);
    }
}

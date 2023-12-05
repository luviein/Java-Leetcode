
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int maxDepth(TreeNode root) {
        // set base code for recursion, 0 means the end of the tree
        if (root == null)
            return 0;

        // to move down left branch and right branch
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // get the highest number between left & right
        // +1 to include the head of the tree
        return 1 + Math.max(left, right);

    }
}

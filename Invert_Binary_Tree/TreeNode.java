
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

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode treeNode = new TreeNode(root.val);
        
            // put right value in original tree into new left node
            treeNode.left = invertTree(root.right);

            // put left value in original tree into new right node
            treeNode.right = invertTree(root.left);

        
        return treeNode;

    }

}

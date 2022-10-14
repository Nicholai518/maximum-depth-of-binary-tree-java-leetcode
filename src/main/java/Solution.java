public class Solution {
    public int maxDepth(TreeNode root) {

        // empty root = 0 depth
        if (root == null) {
            return 0;
        }

        // because the root is NOT null
        // find the depth of the left subtree
        int left = maxDepth(root.left);
        // find the depth of the right subtree
        int right = maxDepth(root.right);

        // return the larger depth (number)
        // +1 to include the root node
        return Math.max(left, right) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);

        TreeNode nine = new TreeNode(9);

        TreeNode root = new TreeNode(3, nine, twenty);

        System.out.println("Example One : " + solution.maxDepth(root));
    }
}

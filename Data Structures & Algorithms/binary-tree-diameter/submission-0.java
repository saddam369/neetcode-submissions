

class Solution {
    int ans = 0;
    int height(TreeNode root) {
        if (root == null)
            return 0;
        int rh = height(root.right);
        int lh = height(root.left);
        ans = Math.max(lh + rh, ans);
        return Math.max(lh, rh) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
}

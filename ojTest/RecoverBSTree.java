package ojTest;

public class RecoverBSTree {
	
	public static void recoverTree(TreeNode root) {
        if(root == null)
        {
            return;
        }
        
        if(root.right != null)
        {
            if(root.val > root.right.val)
            {
                TreeNode tmp = root;
                root = root.right;
                root.right = tmp;
                return;
            }
            else
                recoverTree(root.right);
        }
        
        if(root.left != null)
        {
            if(root.val < root.left.val)
            {
                TreeNode tmp = root;
                root = root.left;
                root.left = tmp;
                return;
            }
            else
                recoverTree(root.left);
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		recoverTree(root);
	}

}

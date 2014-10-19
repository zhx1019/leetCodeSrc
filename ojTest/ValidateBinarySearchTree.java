package ojTest;

public class ValidateBinarySearchTree {
	
	public boolean isValidBST(TreeNode root) {
        
		if(root == null)
		{
			return true;
		}
		
		boolean res;
		if(root.left != null && root.left.val < root.val)
		{
			res = isValidBST(root.left);
		}
		else if (root.left == null)
		{
			res = true;
		}
		else
		{
			res = false;
		}
		
		if(root.right != null && root.right.val > root.val)
		{
			res = isValidBST(root.right);
		}
		else if (root.right == null)
		{
			res = true;
		}
		else
		{
			res = false;
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

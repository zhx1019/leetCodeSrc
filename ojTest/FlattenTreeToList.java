package ojTest;

public class FlattenTreeToList {

	public static void flatten(TreeNode root) {
		if(root == null)
        {
        	return;
        }
        
        flatten(root.right);
        flatten(root.left);
        
        TreeNode tmp = root.left;
        TreeNode head = root;
        if(root.right != null)
        {
        	root.left = root.right;
        	root.right = null;
        	TreeNode tmpr = root.left;
        	while(tmpr != null)
        	{
        	    head = head.left;
        	    tmpr = tmpr.left;
        	}
        	head.left = tmp;
        }
        return;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode rr = new TreeNode(2);
		root.left = rr;
		flatten(root);
	}

}

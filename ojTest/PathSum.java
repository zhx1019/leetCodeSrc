package ojTest;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum)
	{
		if(root == null)
		{
			return false;
		}
//		List<Integer> list = new ArrayList<Integer>();
		return dfs(root, sum, 0);
	}
	
	private boolean dfs(TreeNode root, int sum, int curSum)
	{
		if(root == null)
		{
			return false;
		}
		
		if(root.left == null && root.right == null)
		{
			return curSum + root.val == sum;
		}
		
		return dfs(root.left,sum,curSum+root.val) || dfs(root.right,sum,curSum+root.val);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

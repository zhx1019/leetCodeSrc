package ojTest;

import java.util.LinkedList;

public class MinimumPathBinaryTree {

	public int minDepth(TreeNode root)
	{
		if(root == null)
			return 0;
		/*LinkedList<TreeNode> currNode = new LinkedList<TreeNode>();
		LinkedList<Integer> currDepth = new LinkedList<Integer>();
		currNode.add(root);
		currDepth.add(1);
		while(currNode.isEmpty() != true)
		{
			TreeNode curr = currNode.poll();
			int depth = currDepth.poll();
			if(curr.left != null)
			{
				currNode.add(curr.left);
				currDepth.add(depth+1);
			}
			
			if(curr.right != null)
			{
				currNode.add(curr.right);
				currDepth.add(depth+1);
			}
			
			if(curr.left == null || curr.right == null)
			{
				return depth;
			}
			
		}
		
		return 0;*/
		return getMiniDepth(root);
	}
	
	int getMiniDepth(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int right = getMiniDepth(root.left);
		int left = getMiniDepth(root.right);
		
		return left < right ? left + 1 : right + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

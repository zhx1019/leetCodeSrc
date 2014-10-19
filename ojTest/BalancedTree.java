package ojTest;

import java.util.ArrayList;

public class BalancedTree {
	
	public boolean isBalanced(TreeNode root) {
        if(root == null)
        {
        	return true;
        }
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		traverseTree(root, al, 1);
		int max = al.get(0);
		int min = al.get(0);
		System.out.println(al.get(0));
		for(int i = 1; i < al.size(); i++)
		{
			System.out.println(al.get(i));
			if(al.get(i) < min)
			{
				min = al.get(i);
			}
			
			if(al.get(i) > max)
			{
				max = al.get(i);
			}
			
		}
		
		if(max - min >= 2)
		{
			return false;
		}
		else
			return true;
		
    }
	
	public void traverseTree(TreeNode root, ArrayList<Integer> al, int depth)
	{
		if(root == null)
		{
			return;
		}
		
		if(root.left == null && root.right == null)
		{
			al.add(depth);
		}
		
		traverseTree(root.right, al, depth+1);
		traverseTree(root.left, al, depth+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedTree bt = new BalancedTree();
		TreeNode root = new TreeNode(1);
		TreeNode r1 = new TreeNode(2);
		TreeNode r2 = new TreeNode(3);
		root.right = r1;
		r1.right = r2;
		System.out.println(bt.isBalanced(root));
	}

}

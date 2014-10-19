package ojTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AliTest2 {

	public int getMax(TreeNode root)
	{
		/*int max = 0;
		int min = 0;

		
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        if(root == null)
	            return 0;
	        stack.push(root);
	        
	        while(stack.size() != 0)
	        {
	            TreeNode top = stack.peek();
	            list.add(top.val);
	                stack.pop();
	            
	            if(top.right != null)
	            {
	                stack.push(top.right);

	            }
	            
	            if(top.left != null)
	            {
	                stack.push(top.left);

	            }
	        }
		max = list.get(0);
		min = max;
		for(int i = 1; i < list.size(); i++)
		{
			if(list.get(i) > max)
			{
				max = list.get(i);
			}
			else if(list.get(i) < min)
			{
				min = list.get(i);
			}	
			
		}
		
		return max - min;*/
		
		int max = 0;
		int min = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    if(root == null)
	        return 0;
	    stack.push(root);
	    
	    while(stack.size() != 0)
	    {
	        TreeNode top = stack.peek();
	        list.add(top.val);
	            stack.pop();
	        
	        if(top.right != null)
	        {
	            stack.push(top.right);

	        }
	        
	        if(top.left != null)
	        {
	            stack.push(top.left);

	        }
	    }
		max = list.get(0);
		min = max;
		for(int i = 1; i < list.size(); i++)
		{
			if(list.get(i) > max)
			{
				max = list.get(i);
			}
			else if(list.get(i) < min)
			{
				min = list.get(i);
			}	
			
		}
		
		return max - min;
		
	}
	
	public void post(TreeNode root, List<Integer> list)
    {
        if(root == null)
        {
            return;
        }
        
        post(root.left,list);
        post(root.right,list);
        list.add(root.val);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AliTest2 srln = new AliTest2();
		TreeNode root = new TreeNode(-1);
		TreeNode root1 = new TreeNode(4);
		TreeNode root2 = new TreeNode(3);
		TreeNode root3 = new TreeNode(1334);
		root.left = root1;
		root1.right = root2;
		root.right = root3;
		System.out.println(srln.getMax(root));
		
	}

}

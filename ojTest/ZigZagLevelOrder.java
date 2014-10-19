package ojTest;

import java.util.ArrayList;
import java.util.LinkedList;

public class ZigZagLevelOrder {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        if(root == null)
        {
        	return al;
        }
		LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		nodeQueue.add(root);
		int currNum = 1;
		int nextNum = 0;
		boolean leftFirstFlag = true;
		while(nodeQueue.size() > 0)
		{
			
			TreeNode tn = nodeQueue.poll();
			if(leftFirstFlag == true){
				if(tn.left != null)
				{
					nodeQueue.add(tn.left);
					nextNum++;
				}
				
				if(tn.right != null)
				{
					nodeQueue.add(tn.right);
					nextNum++;
				}
			}
			else
			{
				if(tn.right != null)
				{
					nodeQueue.add(tn.right);
					nextNum++;
				}
				
				if(tn.left != null)
				{
					nodeQueue.add(tn.left);
					nextNum++;
				}
			}
			list.add(tn.val);
			
			currNum--;
			
			if(currNum == 0)
			{
				currNum = nextNum;
				nextNum = 0;
				al.add(new ArrayList(list));
				list.clear();
				
				if(leftFirstFlag == true)
					leftFirstFlag = false;
				else
					leftFirstFlag = true;
			}
			
		}
		
		return al;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

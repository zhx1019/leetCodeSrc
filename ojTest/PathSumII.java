package ojTest;

import java.util.ArrayList;

public class PathSumII {
	
	
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
		getList(root,sum,0,arrList,list);
		return arrList;
    }
	
	private void getList(TreeNode root, int sum, int curSum, ArrayList<ArrayList<Integer>> arrList, ArrayList<Integer> list)
	{
		if(root == null)
		{
			if(sum == curSum)
			{
				arrList.add(list);
			}
			return;
		}
		
		list.add(root.val);
		curSum += root.val;
		if(root.left != null)
		{
			getList(root.left,sum,curSum,arrList,list);
			list.remove(list.size() - 1);
		}
		
		if(root.right != null)
		{
			getList(root.right,sum,curSum,arrList,list);
			list.remove(list.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

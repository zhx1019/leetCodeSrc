package ojTest;

import java.util.ArrayList;

public class BSTNumsII {

	public ArrayList<TreeNode> generateTrees(int n) {
        
		return generate(1,n);
    }
	
	static ArrayList<TreeNode> generate(int left, int right)
	{
		ArrayList<TreeNode> res = new ArrayList<TreeNode>();
		if(left > right)
		{
			res.add(null);
			return res;
		}
		
		for(int i = left; i <= right; i++)
		{
			ArrayList<TreeNode> tleft = generate(left, i - 1);
			ArrayList<TreeNode> tright = generate(i+1, right);
			for(int j = 0; j < tleft.size(); j++)
				for(int k = 0; k < tright.size(); k++)
				{
					TreeNode node = new TreeNode(i);
					node.left = tleft.get(j);
					node.right = tright.get(k);
					res.add(node);
				}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

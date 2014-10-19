package ojTest;

import java.util.ArrayList;
import java.util.List;


public class SumRtoLNumber {
	int getNumFromList(List<Integer> list)
	{
		int res = 0;
		for(int i = 0; i < list.size(); i++)
		{
			res = res * 10 + list.get(i);
		}
		return res;
	}
	void sumNum(TreeNode root,ArrayList<Integer> list,List<ArrayList<Integer>> lis)
	{
		if(root == null)
		{
			lis.add(list);
			return;
		}

		list.add(root.val);
		ArrayList<Integer> tmp = new ArrayList<Integer>(list);
		sumNum(root.left,tmp,lis);
		tmp = new ArrayList<Integer>(list);
		sumNum(root.right,tmp,lis);
		list.remove(list.size() - 1);
	
	}
	public int sumNumbers(TreeNode root) {
	    if(root == null)
		{
			return 0;
		}
	    int res= 0;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    List<ArrayList<Integer>> lis = new ArrayList<ArrayList<Integer>>();
	    sumNum(root,list,lis);
	    for(int i = 0; i < lis.size(); i++)
	    {
	    	for(int j = 0; j < lis.get(i).size(); j++)
	    	{
	    		System.out.println(lis.get(i).get(j));
	    	}
	    }
	    return res/2;
	}
	
	
	/*static int result;
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        result=0;
        if(root == null) return 0;
        
        dfs(root,0);
        return result;
    }
    
    void dfs(TreeNode n, int acstsum){
        if(n == null) return;
        int within=acstsum*10+n.val;
        
        if(n.left == null && n.right ==null) {
            result += within;
            return;
        }
        dfs(n.left,within);
        dfs(n.right,within);
    }*/
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumRtoLNumber srln = new SumRtoLNumber();
		TreeNode root = new TreeNode(1);
		TreeNode root1 = new TreeNode(4);
		TreeNode root2 = new TreeNode(3);
		root.left = root1;
		root1.right = root2;
		System.out.println(srln.sumNumbers(root));
	}

}

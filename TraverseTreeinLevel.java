import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x)
	{
		val = x;
	}
	
}

public class TraverseTreeinLevel {
	
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
        Queue<Integer> depthQueue = new LinkedList<Integer>();
        Stack<ArrayList<Integer>> res = new Stack<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> traverseTree = new ArrayList<ArrayList<Integer>>();
        treeQueue.add(root);
        depthQueue.add(1);
        int currlevelcount = 1;
    	int nextlevelcount = 0;
    	ArrayList<Integer> treeList = new ArrayList<Integer>();
        while(!treeQueue.isEmpty())
        {
        	
        	TreeNode cur = treeQueue.poll();
        	treeList.add(cur.val);
        	currlevelcount--;
        	if(cur.left != null)
        	{
        		treeQueue.add(cur.left);
        		nextlevelcount++;
        	}
        	
        	if(cur.right != null)
        	{
        		treeQueue.add(cur.right);
        		nextlevelcount++;
        	}
        	
        	if(currlevelcount == 0)
        	{
        		currlevelcount = nextlevelcount;
        		nextlevelcount = 0;
        		res.push(treeList);
        		treeList = new ArrayList<Integer>();
        	}
    		        	
        }
        
        while(res.size() > 0)
        {
        	traverseTree.add(res.pop());
        }
        return traverseTree;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

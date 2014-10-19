package ojTest;

import java.util.HashMap;
import java.util.Map;

//class TreeLinkNode {
//	int val;
//	TreeLinkNode left, right, next;
//	TreeLinkNode(int x) 
//	{ 
//		val = x; 
//	}
//}

public class PopulateNextRight {

	void traverseList(TreeLinkNode root,Map<Integer,TreeLinkNode> map,int depth)
	{
		if(root == null)
		{
			return;
		}
		if(map.containsKey(depth))
		{
			root.next = map.get(depth);
			map.remove(depth);
			map.put(depth, root);
		}
		else
		{
			map.put(depth, root);
			root.next = null;
		}
		
		traverseList(root.right,map,depth+1);
		traverseList(root.left,map,depth+1);
	}
	public void connect(TreeLinkNode root) 
	{
        Map<Integer,TreeLinkNode> map = new HashMap<Integer,TreeLinkNode>();
        traverseList(root,map,0);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

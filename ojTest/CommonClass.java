package ojTest;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x)
	{
		val = x;
		left = null;
		right = null;
	}
}

class ListNode1{
	int key;
	int value;
	ListNode1 next;
	ListNode1(int key, int value)
	{
		this.value = value;
		this.key = key;
	}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x)
	{
		val = x;
		next = null;
	}
}
class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x) 
	{ 
		val = x; 
	}
}

class Node{
	
	int val;
	int k;
	Node(int k,int val)
	{
		this.val = val;
		this.k = k;
	}
	
	Node pre;
	Node next;
}


public class CommonClass {

}

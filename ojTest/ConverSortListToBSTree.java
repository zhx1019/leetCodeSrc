package ojTest;

public class ConverSortListToBSTree {
	
	public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
        {
        	return null;
        }
        if(head.next == null)
        {
        	return new TreeNode(head.val);
        }
        
        ListNode middle = getListMiddle(head);
        ListNode right = middle.next;
        middle = null;
        TreeNode root = new TreeNode(middle.val);
        root.right = sortedListToBST(right);
        root.left = sortedListToBST(head);
        return root;
    }
	
	public ListNode getListMiddle(ListNode head)
	{
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	}
	
//	public TreeNode listToBST(ListNode head)
//	{
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

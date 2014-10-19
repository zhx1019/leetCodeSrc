package ojTest;

public class RemoveDuplicateII {
	public ListNode deleteDuplicates(ListNode head) {
		if (null == head || null == head.next)
	        return head;
		ListNode ptr = head;
		head = null;
		ListNode prev = null;
		int dupCount = 0;
		while(null != ptr)
		{
			if(null != ptr.next && ptr.val == ptr.next.val)
				dupCount++;
			else
			{
				if(0 == dupCount)
				{
					if(null == prev)
					{
						prev = ptr;
						head = prev;
					}
					else
					{
						prev.next = ptr;
		                prev = prev.next;
					}
				}
				dupCount = 0;
			}
			ptr = ptr.next;
		}
		if (null != prev)
	        prev.next = null;
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateII rdII = new RemoveDuplicateII();
		ListNode ln = new ListNode(1);
		ln.next = new ListNode(1);
		ln.next.next = new ListNode(1);
		ln.next.next.next = new ListNode(2);
		ln.next.next.next.next = new ListNode(3);
		ln.next.next.next.next.next = new ListNode(3);
		ListNode ln1 = rdII.deleteDuplicates(ln);
		while(ln1 != null)
		{
			System.out.println(ln1.val);
			ln1 = ln1.next;
		}
	}

}

package ojTest;


public class InsertionSort {
	
	
	public ListNode  insertionSortList(ListNode head) 
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		ListNode curr = head;
		ListNode traverseList = head.next;
		while(curr != null && traverseList != null)
		{
			ListNode tmpList;
			
			if(traverseList.val >= curr.val)
			{
				curr = traverseList;
				traverseList = traverseList.next;
				continue;
			}
			
//			ListNode back = curr;
			ListNode h = head;
			if(h.val > traverseList.val)
			{
				tmpList = traverseList;
				curr.next = traverseList.next;
				traverseList.next = h;
				head = traverseList;
				curr = tmpList;
				traverseList = tmpList.next;
			} 
			else
			{
				while(h.val <= traverseList.val && h.next.val <= traverseList.val)
				{
					h = h.next;
				}
				
				tmpList = traverseList;
				curr.next = traverseList.next;
				traverseList.next = h.next;
				h.next = traverseList;
				curr = tmpList;
				traverseList = tmpList.next;
			}
			

		}
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort is = new InsertionSort();
		ListNode head = new ListNode(34);
		ListNode head1 = new ListNode(8);
		ListNode head2 = new ListNode(64);
		ListNode head3 = new ListNode(51);
		ListNode head4 = new ListNode(6);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = null;
		ListNode tmp = is.insertionSortList(head);
		while(tmp != null)
		{
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}

}

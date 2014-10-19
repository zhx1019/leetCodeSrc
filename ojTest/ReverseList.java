package ojTest;

public class ReverseList {

	ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
		{
			return head;
		}
		
		ListNode p = head;
		ListNode pPrev = null;
		ListNode pNext = null;
		
		while(p != null)
		{
			pNext = p.next;
			p.next = pPrev;
			pPrev = p;
			p = pNext;
		}
		
		return pPrev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList re = new ReverseList();
		ListNode head = new ListNode(1);
		ListNode head1 = new ListNode(2);
		ListNode head2 = new ListNode(3);
		ListNode head3 = new ListNode(4);
		ListNode head4 = new ListNode(6);
		ListNode head5 = new ListNode(9);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = null;
		
		/*while(head != null)
		{
			System.out.println(head.val);
			head = head.next;
		}*/
		
		ListNode h = re.reverseList(head);
		
		while(h != null)
		{
			System.out.println(h.val);
			h = h.next;
		}
	}

}

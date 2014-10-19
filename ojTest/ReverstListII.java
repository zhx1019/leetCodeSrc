package ojTest;

public class ReverstListII {

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if(head == null || head.next == null)
			return head;
		
		ListNode posN = head;
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode posM = head;
		ListNode posMprev = newHead;
		for(int i = 1; i < n; i++)
		{
			if(i < m)
			{
				posN = posN.next;
				posM = posM.next;
				posMprev = posMprev.next;
			}
			else
			{
				posN = posN.next;
			}
		}
		
		ListNode posNnext = posN.next;
		posN.next = null;
		ListNode pfir = posM;
		ListNode p = null;
		ListNode pNext = null;
		while(posM != null)
		{
			pNext = posM.next;
			posM.next = p;
			p = posM;
			posM = pNext;
		}
		
		posMprev.next = p;
		pfir.next = posNnext;
        return newHead.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode h = new ListNode(1);
		ListNode h1 = new ListNode(2);
		ListNode h2 = new ListNode(3);
		ListNode h3 = new ListNode(4);
		ListNode h4 = new ListNode(5);
		ListNode h5 = new ListNode(2);
		h.next = h1;
		h1.next =h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = null;
//		ReverstListII re = new ReverstListII();
		ListNode hh = reverseBetween(h,2,4);
		
		while(hh != null)
		{
			System.out.println(hh.val);
			hh = hh.next;
		}
	}

}

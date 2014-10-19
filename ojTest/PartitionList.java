package ojTest;

public class PartitionList {
	
	public static ListNode partition(ListNode head, int x) {
		if(head == null || head.next == null)
		{
			return head;
		}
		
		/*ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode node1 = newHead;
		ListNode pre = null;
		ListNode node2 = head;*/
		
		
		ListNode p = head;
		ListNode pPrev = new ListNode(-1);
		ListNode newHead = pPrev;
		pPrev.next = head;
		while(p != null && p.val < x)
		{
			pPrev = p;
			p = p.next;
		}
		
		if(p == null)
		{
			return newHead.next;
		}
		ListNode pNext = p.next;
		ListNode pNextPrev = p;
		
		while(pNext != null)
		{
			while(pNext != null && pNext.val >= x)
			{
				pNextPrev = pNextPrev.next;
				pNext = pNext.next;
			}
			
			if(pNext == null)
			{
				pPrev.next = p;
				return newHead.next;
			}
			
			/*if(pPrev == null)
			{
				ListNode tmp = p;
				p = pNext;
				pNext = tmp;
				
				pPrev = tmp;
				pNext = p.next;
				pNextPrev = p;
				continue;
			}*/
			
			pNextPrev.next = pNext.next;
			pPrev.next = pNext;
			pPrev = pPrev.next;
			
			pNext = pNextPrev.next; 
		}
		
		pPrev.next = p;
		/*ListNode p = head;
		while(p != null)
		{
			if(p.val == x)
				break;
			p = p.next;
		}
		
		ListNode lleft = head;
		ListNode lright = p.next;
		p.next = null;
		
		while(lleft != null && lright != null)
		{
			while(lleft.val < x && lleft != null)
			{
				lleft = lleft.next;
			}
			
			while(lright.val >= x && lright != null)
			{
				lright = lright.next;
			}
			
			ListNode tmp = lleft;
			lleft = lright;
			lright = tmp;
		}*/
        return newHead.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode h = new ListNode(2);
		ListNode h1 = new ListNode(1);
		ListNode h2 = new ListNode(3);
		ListNode h3 = new ListNode(2);
		ListNode h4 = new ListNode(5);
		ListNode h5 = new ListNode(2);
		h.next = h1;
		h1.next =h2;
		h2.next = null;
		h3.next = h4;
		h4.next = h5;
		
		h = partition(h,2);
		while(h != null)
		{
			System.out.println(h.val);
			h = h.next;
		}
	}

}

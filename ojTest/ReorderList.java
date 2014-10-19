package ojTest;

public class ReorderList {

	public void reorderList(ListNode head) 
	{
        if(head == null || head.next == null)
        {
        	return;
        }
        
        /*ListNode h = head;
        ListNode h2 = head.next;
        while(h != null)
        {
        	ListNode tmp = h;
        	if(tmp.next != null && tmp.next.next == null)
        	{
        		return;
        	}
        	while(tmp.next != null && tmp.next.next != null)
        	{
        		tmp = tmp.next;
        	}
        	 
        	ListNode Last = tmp.next;
        	Last.next = h.next;
        	h.next = tmp.next;
        	tmp.next = null;
        	h = h.next;
        }*/
        
        ListNode t = null;
        ListNode p = head.next;
        ListNode q = head.next.next;
        
        while(q != null)
        {
        	t = q.next;  
            q.next = p;  
            p = q;  
            q = t;
        }
        
        head.next.next = null;
        head.next = p;
        return;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReorderList re = new ReorderList();
		ListNode head = new ListNode(1);
		ListNode head1 = new ListNode(2);
		ListNode head2 = new ListNode(3);
		ListNode head3 = new ListNode(4);
/*		ListNode head4 = new ListNode(6);
		ListNode head5 = new ListNode(9);*/
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = null;
/*		head4.next = head5;
		head5.next = null;*/
		re.reorderList(head);
		while(head != null)
		{
			System.out.println(head.val);
			head = head.next;
		}
	}

}

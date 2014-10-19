package ojTest;

class RandomListNode {
	
	int label;
	RandomListNode next, random;
	RandomListNode(int x)
	{
		this.label = x;
	}
	
}

public class CopyListRandomPointer {
	
	public RandomListNode copyRandomList(RandomListNode head) {
		
		/*if(head == null)
		{
			return head;
		}
		
		RandomListNode tmp = head.next;
        RandomListNode pos1 = new RandomListNode(head.label);
        head.next = pos1;
        pos1.random = head;
        RandomListNode pos2 = pos1;
        RandomListNode headRes = pos1;
        while(tmp != null)
        {
        	pos1.next = new RandomListNode(tmp.label);
        	pos1.next.random = tmp;
        	
        	RandomListNode pos = tmp;
        	tmp = tmp.next;
        	pos.next = pos1.next;
        	pos1 = pos1.next;
        }
        
        while(pos2 != null)
        {
        	if(pos2.random.random != null)
        	{
        		pos2.random = pos2.random.random.next;
        	}
        	else
        	{
        		pos2.random = null;
        	}
        	pos2 = pos2.next;
        	        	
        }
		return headRes;
    }
	*/
		
		if(head == null)
		{
			return head;
		}
		RandomListNode node = head;
		RandomListNode temp = null;
		
		while(node != null)
		{
			temp = node.next;
			RandomListNode newNode = new RandomListNode(node.label);
			node.next = newNode;
			newNode.next = temp;
			node = temp;
		}
		
		node = head;
		while(node != null)
		{
			if(node.random != null)
			{
				node.next.random = node.random.next;
			}
			
			node = node.next.next;
		}
		
		RandomListNode newHead = head.next;
		
		node = head;
		RandomListNode newNode = node.next;
		while(node != null)
		{
			node.next = newNode.next;
			if(newNode.next != null)
			{
				newNode.next = newNode.next.next;
			}
			
			node = node.next;
			if(node != null)
			{
				newNode = node.next;
			}
		}
		
			
		
		RandomListNode newHead1 = head.next;
		node = head;
		
		RandomListNode newNdoe = node.next;
		if(node != null)
		{
			node.next = newNode.next;
			while(newNode.next != null)
			{
				newNode.next = newNode.next.next;
			}
			
			node = node.next;
			if(node != null)
			{
				newNode = node.next;
			}
			
		}
		
		
		
		
		
		return newHead;
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
}


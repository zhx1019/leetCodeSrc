package ojTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class RemoveDuplicate {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
		{
			return head;
		}
		
//        Stack<Integer> stack = new Stack<Integer>();
//        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ListNode traverseListNode = head;
        map.put(head.val, head.val);
        while(traverseListNode != null && traverseListNode.next != null)
        {
        	if(map.containsKey(traverseListNode.next.val))
        	{
        		traverseListNode.next = traverseListNode.next.next;
        		traverseListNode.next.next = null;
        	}
        	else
        	{
        		map.put(traverseListNode.next.val, traverseListNode.next.val);
        	}
        	traverseListNode = traverseListNode.next;
        }
        
        if(map.containsKey(traverseListNode.val))
    	{
    		traverseListNode = null;
    	}

		return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

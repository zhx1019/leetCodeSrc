package ojTest;

import java.util.HashMap;



public class LRUCacheSingleLink {
	
	HashMap<Integer,ListNode> lruMap;
	ListNode head;
	int size;
	
	public LRUCacheSingleLink(int capacity) {
		
		this.lruMap = new HashMap<Integer, ListNode>();
		this.size = capacity;
		head = new ListNode(-1,-1);
		head.next = null;

    }

	public int get(int key) {
    	if(lruMap.containsKey(key))
    	{
    		ListNode p = lruMap.get(key);
    		putToHead(p);
    		return p.value;
    	}
    	else
    		return -1;
    }
	
	private void putToHead(ListNode p)
	{
		if(p.next != null)
		{

		}
		
		
	}
    
    public void set(int key, int value)
    {
        if(lruMap.containsKey(key))
        {
        	Node p = lruMap.get(key);
        	p.val = value;
        	putToHead(p);
        }
        else if(lruMap.size() < size)
        {
        	Node p = new Node(key,value);
        	putToHead(p);
        	lruMap.put(key, p);
        }
        else
        {
        	int tmpk = removeEnd();
        	lruMap.remove(tmpk);
        	Node p = new Node(key,value);
        	putToHead(p);
        	lruMap.put(key, p);

        }
    }
	
    private int removeEnd()
    {
    	Node p = tail.pre;
    	tail.pre.pre.next = tail;
    	tail.pre = tail.pre.pre;
    	p.pre = null;
    	p.next = null;
    			
    	return p.k;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}



}

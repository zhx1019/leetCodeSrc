package ojTest;

import java.util.HashMap;


public class LRUCache {
	
	HashMap<Integer,Node> lruMap;
	Node head,tail;
	int size;
	
	
	public LRUCache(int capacity) {
		
		this.lruMap = new HashMap<Integer, Node>();
		this.size = capacity;
		head = new Node(-1,-1);
		tail = new Node(1,1);
		head.next = tail;
		tail.pre = head;
        
    }

	public int get(int key) {
    	if(lruMap.containsKey(key))
    	{
    		Node p = lruMap.get(key);
    		putToHead(p);
    		return p.val;
    	}
    	else
    		return -1;
    }
	
	private void putToHead(Node p)
	{
		if(p.next != null && p.pre != null)
		{
			p.pre.next = p.next;
			p.next.pre = p.pre;
		}
		
		p.pre = head;
		p.next = head.next;
		head.next.pre = p;
		head.next = p;
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

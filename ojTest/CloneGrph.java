package ojTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class UndirectedGraphNode {
	int label;
	List<UndirectedGraphNode> neighbors;
	UndirectedGraphNode(int x)
	{
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
}
public class CloneGrph {
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node == null)
		{
			return null;
		}
		LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		Set<UndirectedGraphNode> visited = new HashSet<UndirectedGraphNode>();
		Map<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			UndirectedGraphNode n = queue.pop();
			if(visited.contains(n))
			{
				continue;
			}
			visited.add(n);
			UndirectedGraphNode clone;
			if(!map.containsKey(n))
			{
				clone = new UndirectedGraphNode(n.label);
				map.put(n, clone);
			}
			else
			{
				clone = map.get(n);
			}
			
			for(UndirectedGraphNode child : n.neighbors)
			{
				queue.add(child);
				UndirectedGraphNode cloneChild;
				if(!map.containsKey(child))
				{
					cloneChild = new UndirectedGraphNode(child.label);
					map.put(child, cloneChild);
				}
				else
				{
					cloneChild = map.get(child);
					
				}
				clone.neighbors.add(cloneChild);
			}
		}
		
		return map.get(node);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

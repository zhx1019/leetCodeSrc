package ojTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> hashm = new HashMap<Integer,Integer>();
		int [] it = {34,56,78};
		String[] st = {"A", "B", "C", "D"};
		for(Object i:it)
		{
			System.out.println(i);
		}
		
		hashm.put(1, it[0]);
		
		Map map=new HashMap();
		map.put("a", "aaa");
		map.put("b", "bbb");
		map.put("c", "ccc");
		map.put("d", "ddd");
		Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) 
        {
			Object key = iterator.next();
			System.out.println("map.get(key) is :"+map.get(key));
		}  
	}

}

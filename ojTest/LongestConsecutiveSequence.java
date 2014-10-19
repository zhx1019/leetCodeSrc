package ojTest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class LongestConsecutiveSequence {
	public static int longestConsecutive(int[] num) {
        
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		int numLen = num.length;
		for(int i = 0; i < numLen; i++)
		{
			hm.put(num[i], null);
		}
		
		int res = 1;
		for(int i = 0; i < numLen; i++)
		{
			if(hm.containsKey(num[i]))
			{
				int res_tmp = 1;
				int next = num[i] + 1;
				hm.remove(num[i]);
				while(hm.containsKey(next))
				{
					hm.remove(next);
					next++;
					res_tmp++;
				}
				
				int pre = num[i] - 1;
				while(hm.containsKey(pre))
				{
					hm.remove(pre);
					pre--;
					res_tmp++;
				}
				
				if(res < res_tmp)
					res = res_tmp;
			}
		}
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(num));
	}

}

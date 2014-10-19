package ojTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CombinationSumII {
	
	 public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0 || candidates == null)
        {
            return null;
        }
        
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> arrlist = new ArrayList<ArrayList<Integer>>();
        HashMap<ArrayList<Integer>,Integer> hm = new HashMap<ArrayList<Integer>,Integer>();
        int start = 0;
        int end = 1;
        while(end < candidates.length)
        {
        	int conSum = getSum(start,end,candidates);
        	if(conSum == target)
        	{
        		ArrayList<Integer> list = new ArrayList<Integer>();
        		for(int i = start; i <= end; i++)
        		{
        			list.add(candidates[i]);
        		}
        		if(hm.containsKey(list) == false)
        		{
        			hm.put(list, 0);
        			arrlist.add(list);
        		}
        		
        		start++;
        		end++;
        	}
        	else if(conSum < target)
        	{
        		end++;
        	}
        	else
        	{
        		start++;
        	}
        	
        	
        	for (int j = i; j< num.length && num[j]<= target; ++j) 
        	{			
        		list.add(num[j]);			
        		solve(results, list, num, j + 1, target - num[j]);			
        		list.remove(list.size() - 1);			
        		while (j< num.length - 1 && num[j] == num[j + 1]) 
        		{				
        			++j;			
        		}		
        		}	
        	
        }
        /*for(int i = 0; i < arrlist.size(); i++)
        {
        	for(int j = 0; j < arrlist.get(i).size(); j++)
        	{
        		System.out.print(arrlist.get(i).get(j));
        	}
        	System.out.println();
        }*/
        return arrlist;
    }
	 
	public static int getSum(int start, int end, int[] candidates)
	{
		int sum = 0;
		for(int i = start; i <= end; i++)
		{
			sum += candidates[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

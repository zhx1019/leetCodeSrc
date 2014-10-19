package ojTest;
import java.util.ArrayList;
public class CombinationSum {

	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> arrlist = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(0,target,candidates,list,arrlist);
        
/*        for(int i = 0; i < arrlist.size(); i++)
        {
        	for(int j = 0; j < arrlist.get(i).size(); j++)
        	{
        		System.out.print(arrlist.get(i).get(j));
        	}
        	System.out.println();
        }*/
        return arrlist;
    }
	
	void dfs(int start, int sum, int[] candidates, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> arrlist)
	{
		if(sum < 0)
		{
			return;
		}
		if(0 == sum)
		{
			arrlist.add(new ArrayList(list));
			return;
		}
		
		for(int i = start; i < candidates.length; i++)
		{
			if(i > 0 && candidates[i] == candidates[i-1])
			{
				continue;
			}
			
			list.add(candidates[i]);
			dfs(i,sum-candidates[i],candidates,list,arrlist);
			list.remove(list.size()-1);
		}
		
		if(index == candidates.length)
		{
			return;
		}
		
		if(candidates[index] + sum <= target)
		{
			ArrayList tmp = new ArrayList(list);
			tmp.add(candidates[index]);
			dfs(index,target,sum+candidates[index],candidates,tmp,arrlist);
		}
		
		
		if(candidates[index] + sum > target)
		{
			ArrayList tmp = new ArrayList(list);
			if(tmp.size() <= 1)
				return;
			if(tmp.size() >= 2){
				tmp.remove(tmp.size() -1);
			}
			if(index + 1 >= candidates.length)
			{
				return;
			}
			else
			{
				sum = sum - candidates[index] + candidates[index+1];
				tmp.add(candidates[index + 1]);
			}
			dfs(index+1,target,sum,candidates,tmp,arrlist);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSum sc = new CombinationSum();
		int[] candidates = {2,3,5,7};
		int target = 10;
		sc.combinationSum(candidates, target);
	}

}

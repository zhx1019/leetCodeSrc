package ojTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {

	public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        int[] arr = new int[num.length];
        permute_by_backtrace(num,arr,0,num.length,al);
        for(int i = 0; i < al.size(); i++)
        {
        	for(int j = 0; j < al.get(i).size(); j++)
        	{
        		System.out.print(al.get(i).get(j));
        	}
        	System.out.println();
        }
        return al;
    }
	
	public static void  permute_by_backtrace(int[] num, int[] arr,int depth, int len, ArrayList<ArrayList<Integer>> al)
	{
		if(depth == len)
		{
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    for(int i = 0; i < arr.length; i++)
		    {
		        list.add(arr[i]);
		    }
		    al.add(list);
		    Arrays.sort(num);
			return;
		}
		
		for(int i = 0; i < num.length; i++)
		{
		    int flag = 0;
			arr[depth] = num[i];
			for(int j = 0; j < depth; j++)
			{
				if(arr[depth] == arr[j])
				{
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			{
				permute_by_backtrace(num,arr,depth+1,num.length,al);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3};
		permute(a);
	}

}

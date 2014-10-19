package ojTest;

import java.util.ArrayList;
import java.util.Arrays;
public class Sum3Prove {
	
	private static  ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		for(int i = 0; i < num.length; i++)
		{
			if(i > 0 && num[i] == num[i-1])
			{
				continue;
			}
			
			int k = num.length - 1;
			int j = i + 1;
			/*while(j < k)
			{
				if(j > i+1 && num[j] == num[j - 1])
				{
					j++;
					continue;
				}
				
				if(k < num.length - 1 && num[k] == num[k + 1])
				{
					k--;
					continue;
				}
				
				int sum = num[k] + num[j] + num[i];
				if(sum < 0)
				{
					j++;
					continue;
				} 
				else if(sum > 0)
				{
					k--;
					continue;
				}
				else
				{
					ArrayList<Integer> tmp = new ArrayList<Integer>();
					tmp.add(num[i]);
					tmp.add(num[j]);
					tmp.add(num[k]);
					arrList.add(tmp);
					j++;
					k--;
					System.out.print(num[i]);
					System.out.print(num[j]);
					System.out.print(num[k]);
					System.out.println();
				}
			}*/
			
//			int k = num.length - 1;
			for(j = i + 1; j < k; j++)
			{
				if(j > i + 1 && num[j] == num[j - 1])
				{
					continue;
				}
				
				if(k < num.length - 1 && num[k] == num[k + 1])
				{
					j--;
					k--;
					continue;
				}
				
				if(num[k] + num[j] + num[i] < 0)
				{
					continue;
				}
				
				if(num[k] + num[j] + num[i] > 0)
				{
					j--;
					k--;
					continue;
				}
				
				if(num[k] + num[j] + num[i] == 0)
				{
					ArrayList tmp = new ArrayList<Integer>();
					tmp.add(num[i]);
					tmp.add(num[j]);
					tmp.add(num[k]);
					arrList.add(tmp);
					System.out.print(num[i]);
					System.out.print(num[j]);
					System.out.print(num[k]);
					System.out.println();
					k--;
					
				}
				
			}
		}
		return arrList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {-1,0,1,2,-1,-4};
		threeSum(num);
		
	}

}

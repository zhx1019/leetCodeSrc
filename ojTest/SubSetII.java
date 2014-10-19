package ojTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SubSetII {

	private static void shellSort(int[] S)
	{
		int increment = S.length/2;
		while(increment > 0)
		{
			for(int i = increment; i < S.length; i++)
			{
				int tmp = S[i];
				int j = 0;
				for(j = i; j > 0; j-=increment)
				{
					if(tmp < S[j-increment])
					{
						S[j] = S[j -increment];
					}
					else
					{
						break;
					}
				}
				S[j] = tmp;
			}
			
			increment /= 2;
		}
	}
	
	private static void getSubSetwithDup(int[] A)
	{
		ArrayList list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
		getSubSet(A,arrList,list,0);
		/*for(int i = 0; i < arrList.size(); i++)
		{
			for(int j = 0; j < arrList.get(i).size(); j++)
			{
				System.out.print(arrList.get(i).get(j));
			}
			System.out.println();
		}*/
	}
	
	private static void getSubSet(int[] A, ArrayList<ArrayList<Integer>> arrlist, ArrayList<Integer> list, int depth)
	{

		arrlist.add(new ArrayList(list));
		
		for(int i = depth; i < A.length; i++)
		{
			if(depth != i && A[i - 1] == A[i])
			{
				continue;
			}
			list.add(A[i]);
			getSubSet(A,arrlist,list,i+1);
			list.remove(list.size() - 1);
		}
		
	}
	
	/**
	 * 递归的方法解决 subset II 
	 * @param args
	 */
	
/*	public class Solution {
	    List<List<Integer>> result;
		List<Integer> solu;
		public List<List<Integer>> subsetsWithDup(int[] num) {
	        result = new ArrayList<>();
	        solu = new ArrayList<>();
	        Arrays.sort(num);
	        getSubset(num, 0);
	        return result;
	    }
		public void getSubset(int[] num, int st){
			if(solu.size()<=num.length){
				result.add(new ArrayList<>(solu));
			}
			for(int i=st;i<num.length;i++){
				solu.add(num[i]);
				getSubset(num, i+1);
				solu.remove(solu.size()-1);
				while(i<num.length-1 && num[i]==num[i+1]) i++;
			}
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2,1,2};
		shellSort(A);
		getSubSetwithDup(A);
	}
	
	public static void subSetsWithDup(int[] A)
	{
		ArrayList<ArrayList<Integer>> arrlist = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(A);
		arrlist.add(list);
		int index = 0;
		for(int i = 0; i < A.length; i++)
		{
			int size = arrlist.size();
			for(int j = index; j < size; j++)
			{
				list = new ArrayList<Integer>(arrlist.get(j));
				list.add(A[i]);
				arrlist.add(list);
			}
			
			if(i < A.length - 1 && A[i] == A[i+1])
			{
				index = size;
			}
			else
			{
				index = 0;
			}
		}
	}

}

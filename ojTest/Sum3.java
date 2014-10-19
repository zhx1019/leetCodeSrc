package ojTest;
import java.util.ArrayList;
import java.util.Arrays;
public class Sum3 {

	private static  ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		
/*		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i]);
		}
		System.out.println();
		*/
		for(int i = 0; i < num.length - 2; i++)
		{
			for (int j = i + 1; j < num.length - 1; j++)
			{
				if(i >= 1 && num[i] == num[i - 1])
					continue;
				for(int k = j + 1; k < num.length; k++)
				{
					if(num[i] + num[j] + num[k] == 0)
					{
						list.add(num[i]);
						list.add(num[j]);
						list.add(num[k]);
						arrList.add(list);
					}
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

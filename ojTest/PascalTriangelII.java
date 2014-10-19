package ojTest;

import java.util.ArrayList;

public class PascalTriangelII {
	
	public ArrayList<Integer> getRow(int rowIndex) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i <= rowIndex; i++)
		{
			if(i == 0)
			{
				list2.add(1);
			}
			else
			{
				for(int j = 0; j <= i; j++)
				{
					if(j == 0 || j == i)
					{
						list2.add(1);
					}
					else
					{
						list2.add(list.get(j - 1)+ list.get(j));
					}
				}
			}
			
			ArrayList tmp = list;
			list = list2;
			list2 = tmp;
			list2.clear();	
		}
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangelII pt = new PascalTriangelII();
		ArrayList list = pt.getRow(3);
		
		Integer ig = new Integer(100);
		System.out.println(ig.intValue());
	}

}

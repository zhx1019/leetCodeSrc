package ojTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EditDistance {

	public int minDistance(String word1, String word2) {
        int row;
        int col;
        if(word1 == null)
        {
        	row = 0;
        } 
        else 
        {
        	row = word1.length();
        }
        
        if(word2 == null)
        {
        	col = 0;
        }
        else
        {
        	col = word2.length();
        }
        
		if(row == 0 || col == 0)
		{
			return Math.max(row,col);
		}
		int [][] dis = new int[row + 1][col + 1];
		for(int i = 0; i <= row; i++)
		{
			 dis[i][0] = i;
		}
		
		for(int i = 0; i <= col; i++)
		{
			 dis[0][i] = i;
		}
		
		for(int i = 1; i <= row; i++)
		{
			for(int j = 1; j <= col; j++)
			{
				if(word1.charAt(i-1) == word2.charAt(j - 1))
				{
					dis[i][j] = dis[i-1][j-1];
				} 
				else
				{
					dis[i][j] = Math.min(Math.min(dis[i-1][j], dis[i][j-1]),dis[i-1][j-1])+1;
				}
			}
		}
		
		return dis[row][col];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EditDistance ed = new EditDistance();
		System.out.println(ed.minDistance("c", ""));
		int a = 0;
		Integer it = Integer.valueOf(a);
		System.out.println(it.toString());
		System.out.println(it.doubleValue());
		System.out.println(it);
		
		String s = "abc";
		char data[] = s.toCharArray();
		char[] dat1 = s.toCharArray();
		int [][] aa = new int[3][];
		aa[0] = new int[]{4};
		aa[1] = new int[]{4,5};
		aa[2] = new int[]{4,5,6};
		
		for(int[] ac : aa)
		{
			for(int i : ac)
			{
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		Iterator<String> it1 = list.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
 	}

}

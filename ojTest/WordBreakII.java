package ojTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.StringBuffer;

//ArrayList<Integer> list = new ArrayList<Integer>();
//if(root == null)
//    return 0;
//post(root,list);

public class WordBreakII {
	
	void dfs(String s, int begin, boolean[][] wb_map,Set<String> dict, List<String> list, StringBuilder str)
	{
		int i = 0;
		if(begin == s.length())
		{
//			str.toString().trim();
			list.add(str.toString().trim());
			str.delete(0, str.length());
			return;
		}
		
		for(i = begin; i < s.length(); i++)
		{
			StringBuilder s1 = new StringBuilder(s.substring(begin,i+1));
			if(dict.contains(s1.toString()))
			{
				str.append(" ").append(s1);
				dfs(s,i+1,wb_map,dict,list,str);
			}
		}
	}
	
	void dp(String s, boolean[][] wb_map,Set<String> dict)
	{
		int i = 0;
		int j = 0;
		int l = 0;
		/*for(i = 0; i < s.length(); i++)
		{
			for(j = i; j < s.length(); j++)
			{
				StringBuilder s1 = new StringBuilder(s.substring(i,j+1));
				if(dict.contains(s1.toString()))
				{
					wb_map[i][j] = true;
				}
			}
			
		}*/
		
		// dp fangfa
		
		for(i = 0; i < s.length(); i++)
		{
			for(j = i + 1; j <= s.length(); j++)
			{
				StringBuffer s3 =new StringBuffer(s.substring(i, j));
				for(l = i; l < j - 1; l++)
				{
					StringBuffer s1 = new StringBuffer(s.substring(i,l+1));
					StringBuffer s2 = new StringBuffer(s.substring(l+1, j));
					if(wb_map[i][l] && wb_map[l+1][j - 1] || dict.contains(s.substring(i,j)))
					{
						wb_map[i][j-1] = true;
					}
				}
			}
		}
	}
	
	public List<String> wbreak(String s, Set<String> dict)
	{
		List<String> list = new ArrayList<String>();
		StringBuilder stb = new StringBuilder();
		boolean wb_map[][] = new boolean[s.length() + 1][s.length() + 1];
	//	wb_map[0][0] = true;
	//	dp(s,wb_map,dict);
		
		/*for(int i = 0; i <= s.length(); i++)
		{
			for(int j = 0; j <= s.length(); j++)
			{
				System.out.print(wb_map[i][j]+" ");
			}
			System.out.println();
		}*/
		dfs(s,0,wb_map,dict,list,stb);
		
		return list;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("cat");
		set.add("cats");
		set.add("and");
		set.add("sand");
		set.add("dog");
		String s = "catsanddog";
		List<String> list = new ArrayList<String>();
		WordBreakII wb = new WordBreakII();
		list = wb.wbreak(s, set);
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}

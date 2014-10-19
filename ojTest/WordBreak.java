package ojTest;

import java.util.HashSet;
import java.util.Set;

/*
 * 首先我们要决定要存储什么历史信息以及用什么数据结构来存储信息。
 * 然后是最重要的递推式，就是如从存储的历史信息中得到当前步的结果。
 * 最后我们需要考虑的就是起始条件的值。
 * 
 * 递推式 : res[j] && s.substring[j,i+1]    前i个字符 是否在字典里由（前j个和j到i两个判读共同决定）
 * */

public class WordBreak {
	
//	public boolean
	
//	void setMap(String s, Set<String> dict, boolean[][] map)
//	{
//		int i = 0;
//		int j = 0;
//		for(i = 0; i < s.length(); i++)
//		{
//			for(j = i; j < s.length(); j++)
//			{
//				String s1 = s.substring(i,j+1);
//				if(dict.contains(s1))
//				{
//					map[i][j] = true;
//				}
//			}
//		}
//		
//	}
	
	
	
	public boolean wbreak(String s, Set<String> dict) 
	{
		if(s == null || s.length() == 0)
		{
			return true;
		}
		int i = 0;
		int j = 0;
		
		boolean res[] = new boolean[s.length() + 1];
		res[0] = true;
				
		
		for(i = 0 ; i < s.length(); i++)
		{
			for(j = 0; j <= i; j++)
			{
				StringBuffer str = new StringBuffer(s.substring(j, i+1));
				if(res[j] && dict.contains(str.toString()))
				{
					res[i + 1] = true;
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(i = 0; i < s.length(); i++)
		{ 
			StringBuilder str = new StringBuilder(s.substring(0,i + 1));
			for(j = 0; j <= i; j++)
			{
				if(res[j] && dict.contains(str.toString()))
				{
					res[i + 1] = true;
					break;
				}
				else
				{
					str.deleteCharAt(0);
				}
			}
		}*/
		return res[s.length()];
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("leet");
		set.add("code");
		String s = "leetcode";
		WordBreak wb = new WordBreak();
		System.out.println(wb.wbreak(s, set));
	}

}

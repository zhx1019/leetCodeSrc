package ojTest;

import java.util.HashSet;
import java.util.Set;

public class WordLadderdfs {
	
	public int ladderLength(String start, String end, Set<String> dict) {
		
		if(dict == null)
		{
			return 0;
		}
		
		String wordDict = "abcdefghijklmnopqrstuvwxyz";
		int[] min = {Integer.MAX_VALUE};
		minLadderLength(start, end, dict, 1, min,wordDict);	
		if(min[0] == Integer.MAX_VALUE)
        {
        	return 0;
        }
        else
        {
        	return min[0];
        }
    }
	
	public void minLadderLength(String start, String end, Set<String> dict, int len, int[] min, String wordDict)
	{
		if(start.equals(end))
		{
			if(len < min[0])
			{
				min[0] = len;
			}
			return;	
		}
		
		
		for(int i = 0; i < start.length(); i++)
		{
			StringBuffer str = new StringBuffer(start);
			for(int k = 0; k < 26; k++)
			{
				if(str.charAt(i) != wordDict.charAt(k))
				{
					str.setCharAt(i, wordDict.charAt(k));
					
					/*if(str.toString().equals(end))
					{
//						len++;
						if(len < min[0])
						{
							min[0] = len;
						}
						return;
					}*/
					
					if(dict.contains(str.toString()))
					{
						len++;
						dict.remove(str.toString());
						minLadderLength(str.toString(), end, dict, len, min, wordDict);
						dict.add(str.toString());
					}
				}
			}

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("hot");
		set.add("dot");
		set.add("dog");
		set.add("lot");
//		set.add("log");
		set.add("cog");
		set.add("hoc");
		String start = "hit";
		String end = "cog";
		WordLadderdfs wld = new WordLadderdfs();
		System.out.println(wld.ladderLength(start, end, set));
	}

}

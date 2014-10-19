package ojTest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadderBfs {
	public int ladderLength(String start, String end, Set<String> dict) {
		if(dict.size() == 0)
		{
			return 0;
		}
		
		LinkedList<String> wordQueue = new LinkedList<String>();
		LinkedList<Integer> distanceQueue = new LinkedList<Integer>();
		wordQueue.add(start);
		distanceQueue.add(1);
		while(!wordQueue.isEmpty())
		{
			String currWord = wordQueue.pop();
			Integer currDistance = distanceQueue.pop();
			if(currWord.equals(end))
			{
				return currDistance;
			}
			
			for(int i = 0; i < currWord.length(); i++)
			{
				char[] currCharArr = currWord.toCharArray();
				for(char c = 'a'; c <= 'z'; c++)
				{
					currCharArr[i] = c;
					String newWord = new String(currCharArr);
					if(dict.contains(newWord))
					{
						wordQueue.add(newWord);
						distanceQueue.add(currDistance+1);
						dict.remove(newWord);
					}
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("hot");
		set.add("dot");
		set.add("dog");
		set.add("lot");
		set.add("cog");
		String start = "hit";
		String end = "cog";
		WordLadderBfs wlb = new WordLadderBfs();
		System.out.println(wlb.ladderLength(start, end, set));
	}

}

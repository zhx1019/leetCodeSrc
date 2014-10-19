package ojTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakII_betterSolution {

	HashMap<String, List<String>> map= new HashMap<String, List<String>>();
	public List<String> wordBreak(String s, Set<String> dict) {
	    List<String> list=new ArrayList<String>();

	    if(map.containsKey(s)) return map.get(s);

	    for(int i=1; i<=s.length();i++){
	        String left=s.substring(0,i);
	        String right=s.substring(i);
	        if(dict.contains(left)){
	            List<String> a=wordBreak(right, dict);
	            for(String b:a){
	                list.add(left+" "+b);
	            }
	            if(right.length()==0) list.add(left);
	        }

	    }

	    map.put(s, list);
	    return list;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("cat");
		set.add("cats");
		set.add("and");
		set.add("sand");
		set.add("dog");
		String s = "catsanddog";
		List<String> list = new ArrayList<String>();
		WordBreakII_betterSolution wb = new WordBreakII_betterSolution();
		list = wb.wordBreak(s, set);
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

}

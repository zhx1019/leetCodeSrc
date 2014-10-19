package ojTest;

import java.util.ArrayList;

public class RestoreIPAddresses {
	/**
	 * 利用循环做
	 * @param s
	 * @return
	 */
	public static ArrayList<String> restoreIpAddresses1(String s) {
        ArrayList<String> as = new ArrayList<String>();
        if(s == null || s.length() < 4)
        {
        	return as;
        }
        char[] sToChar = s.toCharArray();
        
        for(int i = 0; i < 3; i++)
        {
        	if(Integer.parseInt(s.substring(0, i+1)) > 255)
				break;
        	if(s.substring(0, i+1).charAt(0) == '0' && s.substring(0, i+1).length() > 1)
        		break;
        	for(int j = i + 1; j < i + 4 && j < sToChar.length - 2; j++)
        	{
        		if(Integer.parseInt(s.substring(i+1, j+1)) > 255)
    				break;
        		
        		if(s.substring(i+1, j+1).charAt(0) == '0' && s.substring(i+1, j+1).length() > 1)
            		break;
        		
        		for(int k = j + 1; k < j + 4 && k < sToChar.length - 1; k++)
        		{
        			if(Integer.parseInt(s.substring(j+1,k+1)) > 255)
        				break;
        			if(s.substring(j+1,k+1).charAt(0) == '0' && s.substring(j+1,k+1).length() > 1)
                		break;
        			
        			if(s.substring(k+1).charAt(0) == '0' && s.substring(k+1).length() > 1)
                		continue;
        			
        			if(sToChar.length - k - 1 <= 3 && Integer.parseInt(s.substring(k+1)) <= 255){
        				StringBuffer sb = new StringBuffer();
        				sb.append(s.substring(0, i+1));
        				sb.append('.');
	        			sb.append(s.substring(i+1, j+1));
	        			sb.append('.');
	        			sb.append(s.substring(j+1,k+1));
	        			sb.append('.');
	        			sb.append(s.substring(k+1));
	        			as.add(sb.toString());
        			}
        		}
        	}
        }
        
        for(int i = 0; i < as.size(); i++)
        {
        	System.out.println(as.get(i));
        }
        return as;
    }
	
	/**
	 * 利用DFS来做
	 * @param args
	 */
	public static ArrayList<String> restoreIpAddresses(String s) {
		ArrayList<String> as = new ArrayList<String>();
		if(s == null || s.length() < 4)
		{
			return as;
		}
		int[] pos = new int[3];
		char[] sToChar = s.toCharArray();
		dfs(sToChar,3,0,pos,as,0);
 		return as;
	}
	
	public static void dfs(char[] s, int maxDepth, int depth, int[] pos, ArrayList<String> as,int start) 
	{
		if(depth == maxDepth)
		{
			return;
		}
		
		for(int i = start; i < start + 3 && i < s.length; i++)
		{
			if(check(s,start,i))
			{	
				pos[depth] = i;
				dfs(s,maxDepth,depth+1,pos,as,i+1);
			}
		}
	}
	
	public static boolean check(char[] s, int start, int end)
	{
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		restoreIpAddresses("010010");
	}

}

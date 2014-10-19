package ojTest;

public class LongestPalindromicSubstring {
	
	public static String longestPalindrome(String s) {
        if(s == null && s.length() <= 1)
        {
        	return s;
        }
		String ret = "";
		int max = 1;
		int[][] map = new int[s.length()][s.length()];
        for(int i = s.length() - 1; i >= 0; i--)
        {
            for(int j = i; j < s.length(); j++)
            {
            	if(j == i)
            		map[i][j] = 1;
            	else
            		if(s.charAt(i) == s.charAt(j))
	                {
	                    if((j == i + 1) || map[i+1][j-1] == 1)
	                    {
	                        map[i][j] = 1;
	                    }
	                }
            	
//            	System.out.print(" " + map[i][j]);
            	
            	if(map[i][j] == 1)
            	{
            		if(max < j - i + 1)
            		{
            			max = j - i + 1;
            			ret = s.substring(i, j + 1);
            		}
            	}
            }
            
        }
		/*for(int i = 0; i < s.length(); i++)
		{
			for(int j = s.length() - 1; j >= i + 1; j--)
			{
				
				if(s.charAt(i) == s.charAt(j))
				{
					int left = i + 1;
					int right = j - 1;
					while(right > left)
					{
						if(s.charAt(left) == s.charAt(right))
						{
							left++;
							right--;
						}
						else
						{
							break;
						}
					}
					
					if(left >= right)
					{
						if(max < j - i + 1)
						{
							max = j - i + 1;
							ret = s.substring(i, j + 1);
						}
						
//						i = j + 1;
//						break;
					}
				}
				
				
				
				
			}
		}*/
		
		
		return ret;
    }
	
	public static void getMap(String s,int [][] map)
    {
		
		
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestPalindrome("aaaabaaa"));
	}

}

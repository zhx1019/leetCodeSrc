package ojTest;

public class RegularExpressionMatching {
	public static boolean isMatch(String s, String p) {
		if(s == null || s.length() == 0)
			return true;
		if(p == null || p.length() == 0)
			return false;
		int sLen = s.length();
		int pLen = p.length();
		int i = 0;
		int j = 0;
		char pre = '\0';
		while(i < sLen && j < pLen)
		{
//			pre = p.charAt(i);
			if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')
			{
				pre = s.charAt(i);
				i++;
				j++;
			}
			else if(j > 0 && p.charAt(j) == '*' && s.charAt(i) == pre)
			{
				i++;
//				j++;
			}
			else if(j > 0 && p.charAt(j) == '*' && p.charAt(j-1) == '.')
			{
//				pre = s.charAt(i);
				i++;
//				j++;
			}
			else
			{
				j++;
				if(p.charAt(j - 1) != '*' && p.charAt(j - 1) != '.')
					pre = p.charAt(j - 1);
			}
		}
		if(i == sLen)
			return true;
		else
			return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("ab", ".*"));
	}

}

package ojTest;

import java.util.Stack;

public class ValidNumber {

	public static boolean isNumber(String s)
	{
		if(s == null || s.length() == 0)
		{
			return false;
		}
		String s1 = s.trim();
		System.out.println(s1);
		Stack<Character> _stack = new Stack<Character>();
		boolean pointFlag = false;
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == '.' && i > 0)
			{
				if(pointFlag == true){
					return false;
				}
				else
				{
					pointFlag = true;
				}
				
				continue;
			}
			
			if(s1.charAt(i) == '.' && i == 0)
			{
				pointFlag = true;
				continue;
			}
			if(s1.charAt(i) == '-' || s1.charAt(i) == '+')
			{
				if(i != 0)
				{
					return false;
				}
			}
			
			if(s1.charAt(i) < '0' || s1.charAt(i) > '9')
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNumber("-1."));
	}

}

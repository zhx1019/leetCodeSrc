package reviewBaodian;

import java.util.Stack;

public class CharConsecutive {
	
	public String transferString(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		char[] s1 = new char[s.length() * 2];
		int count = 1;
		stack.push(s.charAt(0));
//		System.out.println(s.charAt(0));
		for(int i = 1; i < s.length(); i++)
		{
			if(stack.peek() == s.charAt(i))
			{
				count++;
			}
			else
			{
				String ss = Integer.toString(count);
				for(int j = 0; j < ss.length(); j++)
				{
					stack.push(ss.charAt(j));
				}
				stack.push(s.charAt(i));
				count = 1;
			}
		}
		
		if(s.charAt(s.length() - 2) != s.charAt(s.length() - 1))
		{
			count = 1;
			
		}
		
		
		String ss = Integer.toString(count);
		for(int j = 0; j < ss.length(); j++)
		{
			stack.push(ss.charAt(j));
		}
		
		
//		while(stack.size() > 0)
//		{
//			System.out.println(stack.pop());
//		}
		
		StringBuffer sbf = new StringBuffer();
		while(stack.size() > 0)
		{
			sbf.append(stack.pop());
		}
		
		sbf.reverse();
		
		return sbf.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharConsecutive ccs = new CharConsecutive();
		System.out.println(ccs.transferString("111111111111233422222"));

	}

}

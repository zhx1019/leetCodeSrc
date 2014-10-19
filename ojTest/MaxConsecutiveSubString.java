package ojTest;

public class MaxConsecutiveSubString {
	
	public String findSubString(String str)
	{
		int i = 0;
		int j = 0;
		int k = 0;
//		System.out.println(str.substring(0,0));
		int max = 0;
		int maxR = 0;
		String subStr1 = "";
		String subStr;
		String res = "";
		for(i = 0; i < str.length(); i++)
		{
			for(j = str.length(); j > i; j--)
			{
				if(j - i != str.length())
				{
					subStr = str.substring(i, j);
					int a = str.indexOf(subStr);
					int b = str.lastIndexOf(subStr);
					if(a != b)
					{
//						res = subStr;
						maxR = subStr.length();
						if(max < maxR)
						{
							max = maxR;
							res = subStr;
						}
					}
				}
			}
		}
		System.out.println(res);
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConsecutiveSubString mcss = new MaxConsecutiveSubString();
		String s = mcss.findSubString("abcabc");
		System.out.println(s);
	}

}
package ojTest;

public class AliTest1 {

	/*public int getLongestLength(String str1, String str2)
	{
		if(str1.length() == 0 || str2.length() == 0)
		{
			return 0;
		}
		int res = 0;
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		for(int i = 0; i < s1.length; i++)
		{
			for(int j = 0; j < s2.length; j++)
			{
				if(s2[j] == s1[i])
				{
					int pos = 1;
					while((j+pos < s2.length) && (i+pos < s1.length))
					{
						if(s2[j+pos] == s1[i+pos])
						{
							pos++;
						}
						else
						{
							break;
						}
					}
					
					if(pos > res)
					{
						res = pos;
					}
				}
			}
		}
		
		int 
 		return res;
	}*/
	
	/*public static void getLCString(String query, String text) {
		int len1, len2;
		len1 = query.length();
		len2 = text.length();
		int maxLen = len1 > len2 ? len1 : len2;
		char[] str1 = query.toCharArray();
		char[] str2 = text.toCharArray();
		
		
		int[] max = new int[maxLen];
		int[] maxIndex = new int[maxLen];
		int[] c = new int[maxLen];

		int i, j;
		for (i = 0; i < len2; i++) {
			for (j = len1 - 1; j >= 0; j--) {
				if (str2[i] == str1[j]) {
					if ((i == 0) || (j == 0))
						c[j] = 1;
					else
						c[j] = c[j - 1] + 1;
				} else {
					c[j] = 0;
				}

				if (c[j] > max[0]) {
					max[0] = c[j];
					maxIndex[0] = j;

					for (int k = 1; k < maxLen; k++) {
						max[k] = 0;
						maxIndex[k] = 0;
					}
				}
				
				else if (c[j] == max[0]) {
					for (int k = 1; k < maxLen; k++) {
						if (max[k] == 0) {
							max[k] = c[j];
							maxIndex[k] = j;
							break;
						}
					}
				}
			}
			for (int temp : c) {
				System.out.print(temp);
			}
			System.out.println();
		}
        
		for (j = 0; j < maxLen; j++) {
			if (max[j] > 0) {
				System.out.println("第" + (j + 1) + "个公共子串:");
				for (i = maxIndex[j] - max[j] + 1; i <= maxIndex[j]; i++)
					System.out.print(str1[i]);
				System.out.println(" ");
			}
		}
	}*/
	
	
	public int getLongestLength(String query, String text)
	{
		if(query.length() == 0 || text.length() == 0)
		{
			return 0;
		}
		int res = 0;
		char[] s1 = query.toCharArray();
		char[] s2 = text.toCharArray();
		for(int i = 0; i < s1.length; i++)
		{
			for(int j = 0; j < s2.length; j++)
			{
				if(s2[j] == s1[i])
				{
					int pos = 1;
					while((j+pos < s2.length) && (i+pos < s1.length))
					{
						if(s2[j+pos] == s1[i+pos])
						{
							pos++;
						}
						else
						{
							break;
						}
					}
					
					if(pos > res)
					{
						res = pos;
					}
				}
			}
		}
	 	return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AliTest1 ali = new AliTest1();
		System.out.println(ali.getLongestLength("acbac","acaccbabb"));
	}

}

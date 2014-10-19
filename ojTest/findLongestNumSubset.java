package ojTest;

public class findLongestNumSubset {

	private static void findNumSubset(String str)
	{
		int[] len = new int[str.length()+1];
		len[0] = 0;
		for(int i = 0; i <= str.length() - 1; i++)
		{
			int len_s = 0;
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				len_s = 1;
				int j = i + 1;
				while(j < str.length() && str.charAt(j) >= '0' && str.charAt(j) <= '9')
				{
					len_s++;
					j++;
				}
			}
			len[i] = len_s;
		}
		
		int max = 0;
		int index = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(max < len[i])
			{
				max = len[i];
				index = i;
			}
		}
		StringBuffer res = new StringBuffer();
		for(int i = index ; i < index + max; i++)
		{
			res.append(str.charAt(i));
		}
		
		System.out.println(res.toString());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findNumSubset("a45678bcd12345ed125ss12345");
	}

}

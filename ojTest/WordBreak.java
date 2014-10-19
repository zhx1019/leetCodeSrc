package ojTest;

import java.util.HashSet;
import java.util.Set;

/*
 * ��������Ҫ����Ҫ�洢ʲô��ʷ��Ϣ�Լ���ʲô���ݽṹ���洢��Ϣ��
 * Ȼ��������Ҫ�ĵ���ʽ��������Ӵ洢����ʷ��Ϣ�еõ���ǰ���Ľ����
 * ���������Ҫ���ǵľ�����ʼ������ֵ��
 * 
 * ����ʽ : res[j] && s.substring[j,i+1]    ǰi���ַ� �Ƿ����ֵ����ɣ�ǰj����j��i�����ж���ͬ������
 * */

public class WordBreak {
	
//	public boolean
	
//	void setMap(String s, Set<String> dict, boolean[][] map)
//	{
//		int i = 0;
//		int j = 0;
//		for(i = 0; i < s.length(); i++)
//		{
//			for(j = i; j < s.length(); j++)
//			{
//				String s1 = s.substring(i,j+1);
//				if(dict.contains(s1))
//				{
//					map[i][j] = true;
//				}
//			}
//		}
//		
//	}
	
	
	
	public boolean wbreak(String s, Set<String> dict) 
	{
		if(s == null || s.length() == 0)
		{
			return true;
		}
		int i = 0;
		int j = 0;
		
		boolean res[] = new boolean[s.length() + 1];
		res[0] = true;
				
		
		for(i = 0 ; i < s.length(); i++)
		{
			for(j = 0; j <= i; j++)
			{
				StringBuffer str = new StringBuffer(s.substring(j, i+1));
				if(res[j] && dict.contains(str.toString()))
				{
					res[i + 1] = true;
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(i = 0; i < s.length(); i++)
		{ 
			StringBuilder str = new StringBuilder(s.substring(0,i + 1));
			for(j = 0; j <= i; j++)
			{
				if(res[j] && dict.contains(str.toString()))
				{
					res[i + 1] = true;
					break;
				}
				else
				{
					str.deleteCharAt(0);
				}
			}
		}*/
		return res[s.length()];
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("leet");
		set.add("code");
		String s = "leetcode";
		WordBreak wb = new WordBreak();
		System.out.println(wb.wbreak(s, set));
	}

}

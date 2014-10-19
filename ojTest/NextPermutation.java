package ojTest;

public class NextPermutation {

	public static void nextPermutation(int[] num) {
        if(num == null || num.length == 0)
        {
        	return;
        }
        
        int i = 0;
        
		for(i = num.length - 1; i > 0; i--)
		{
			if(num[i] > num[i - 1])
			{
				break;
			}
		}
		
		System.out.println(i);
		if(i == 0)
		{
			int j = 0; 
			int k = num.length - 1;
			while(k > j)
			{
				if(num[j] == num[k])
				{
					return;
				}
				else
				{
					int tmp = num[j];
					num[j] = num[k];
					num[k] = tmp;
					j++;
					k--;
				}
			}
		}
		else
		{
			int index = i;
			while(index <= num.length - 1)
			{
				if(num[index] <= num[i-1])
				{
					break;
				}
				index++;
			}
			
			int tmp = num[i-1];
			num[i-1] = num[index-1];
			num[index - 1] = tmp;
			
			int j = i; 
			int k = num.length - 1;
			while(k > j)
			{
					tmp = num[j];
					num[j] = num[k];
					num[k] = tmp;
					j++;
					k--;
			}
		}
		
		for(i = 0; i < num.length; i++)
		{
			System.out.print(" " + num[i]);
		}
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,3,1};
		nextPermutation(a);
	}

}

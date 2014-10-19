package ojTest;

public class BSTNums {
	
	public static int numTrees(int n) {
		if(n == 0)
		{
			return 0;
		}
		
//		if(n == 0)
//			return 1;
		/*int[] num = new int[n + 1];
		num[0] = 1;
        for(int i = 1; i <= n; i++)
        {
        	if(i < 3)
        	{
        		num[i] = i;
        	}
        	else
        	{
        		for(int j = 1; j <= i; j++)
        		{
        			num[i] = num[i] + num[i-j]*num[j-1];
        		}
        	}
        }
        
        System.out.println(num[n]);*/
		
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		int count = 0;
		if(n > 2)
		{
			for(int i = 2; i <= n - 1; i++)
				count += numTrees(i - 1) * numTrees(n - i) ;
		}
		
		count += 2*numTrees(n-1);
		return count;
		
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(3));
	}

}

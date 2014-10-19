package ojTest;

public class SellStockIII {

	public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
        {
        	return 0;
        }
        
        int n = prices.length;
        int[] profitEachDay = new int[n];
		profitEachDay[0] = 0;
		for(int i = 1; i < n; i++)
		{
			profitEachDay[i] = prices[i] - prices[i-1];
		}
		
		
		int[] r_sum = new int[n];
		int[] l_sum = new int[n];
		
		for(int i = 1; i < n; i++)
		{
			if(profitEachDay[i] <= 0)
			{
				l_sum[i] = l_sum[i - 1];
			}
			else
				l_sum[i] = l_sum[i - 1] + profitEachDay[i];
			
			
			System.out.print(" "+l_sum[i]);
		}
		
		System.out.println();
		
		
		r_sum[n-1] = profitEachDay[n-1];
		
		for(int i = n - 2; i >= 0; i--)
		{
			if(r_sum[i+1] < 0)
			{
				r_sum[i] = profitEachDay[i];
			}
			else
			{
				r_sum[i] = profitEachDay[i] + r_sum[i+1];			
			}		
			
			System.out.print(" " + r_sum[i]);
		}
		System.out.println();
		r_sum[0] = 0;
		l_sum[0] = 0;
		
		
		
		
		int min = prices[0];
        for(int i = 1; i < n; i++)
        {
        	l_sum[i] = l_sum[i - 1] > prices[i] - min ? l_sum[i - 1] : prices[i] - min;
        	min = min < prices[i] ? min : prices[i];
        	System.out.print(" "+l_sum[i]);
        }
        
        int max = prices[n-1];
        for(int i = n - 2; i >= 0; i--)
        {
        	r_sum[i] = r_sum[i + 1] > max - prices[i] ? r_sum[i+1] : max - prices[i];
        	max = max > prices[i] ? max : prices[i];
        	System.out.print(" " + r_sum[i]);
        }
        System.out.println();
		
		
		
        int value = 0;
        for(int i = 0; i < n - 1; i++)
        {
        	value = value > l_sum[i] + r_sum[i + 1] ? value : l_sum[i] + r_sum[i+1];
        	
        }
        return value;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellStockIII ss = new SellStockIII();
		int[] price = {3,3,5,0,0,3,1,4};
		System.out.println(ss.maxProfit(price));
	}

}

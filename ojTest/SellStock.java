package ojTest;

public class SellStock {
	
	public int maxProfit(int[] prices){
		if(prices == null || prices.length <= 1)
		{
			return 0;
		}
		
		/*int[] profitEachDay = new int[prices.length];
		profitEachDay[0] = 0;
		for(int i = 1; i < prices.length; i++)
		{
			profitEachDay[i] = prices[i] - prices[i-1];
			System.out.print(" " + profitEachDay[i]);
		}
		
		System.out.println();
		int[] sum = new int[prices.length];
		sum[0] = profitEachDay[0];
		for(int i = 1; i < profitEachDay.length; i++)
		{
			if(sum[i -1] <= 0)
			{
				sum[i] = profitEachDay[i];
			}
			else
			{
				sum[i] = profitEachDay[i] + sum[i-1];
			}
		}
		int max = sum[0];
		for(int i = 0; i < profitEachDay.length;i++)
		{
			if (max < sum[i])
				max = sum[i];
		}*/
		
		int maxPrice = prices[prices.length- 1];
		int ans = 0;
		
		for(int i = prices.length - 1; i >= 0; i--)
		{
			
			maxPrice = maxPrice > prices[i] ? maxPrice : prices[i];
			
			ans = ans > maxPrice - prices[i] ? ans : maxPrice - prices[i];
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellStock ss = new SellStock();
		int[] price = {1,2,4};
		System.out.println(ss.maxProfit(price));
	}

}

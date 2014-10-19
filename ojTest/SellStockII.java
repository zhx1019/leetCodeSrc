package ojTest;

public class SellStockII {
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length <= 1)
		{
			return 0;
		}
		
		int[] profitEachDay = new int[prices.length];
		profitEachDay[0] = 0;
		for(int i = 1; i < prices.length; i++)
		{
			profitEachDay[i] = prices[i] - prices[i-1];
		}
		int sum = 0;
		for(int i = 0; i < profitEachDay.length; i++)
		{
			if(profitEachDay[i] > 0)
			{
				sum += profitEachDay[i];
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

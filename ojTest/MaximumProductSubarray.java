package ojTest;

public class MaximumProductSubarray {

	public int maxProduct(int[] A)
	{
	    if(A.length < 1)
	    	return 0;
		
	    int[][] product = new int[A.length][A.length];
	    int max_product = Integer.MIN_VALUE;
	    for(int i = 0; i < A.length; i++)
	    {
	    	product[i][i] = A[i];
	    	if(max_product < A[i])
	    	{
	    		max_product = A[i];
	    	}
	    }
	    
	    for(int i = 0; i < A.length - 1; i++)
	    {
	    	for(int j = i + 1; j < A.length; j++)
	    	{
	    		product[i][j] = product[i][j-1] * A[j];
	    		max_product = Math.max(Math.max(max_product, product[i][j]),A[j]);
//	    		if(max_product < product[i][j])
//		    	{
//		    		max_product = product[i][j];
//		    	}
	    	}
	    }
	    
	    return max_product;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

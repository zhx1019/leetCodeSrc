package ojTest;

public class SingleNumber {
	
	public int single(int [] A)
	{
		int i = 0;
		int[] bitNum = new int[32];
		int res = 0;
		
		for(i = 0; i < 32; i++)
		{
			for(int j = 0; j < A.length; j++)
			{
				bitNum[i] = bitNum[i] + ((A[j]>>i)&1);

			}
		}
		
//		for(int j = 0; j < 32; j++)
//		{
//			System.out.print(bitNum[j] + "  ");
//		}
		for(int j = 0; j< 32; j++)
		{
			res |= (bitNum[j] % 3) << j;
		}
		return res;
	}
	
//	public int single(int[] A) {
//        int result = 0;
//		for(int i=0;i<32;i++){
//        	int count = 0;
//        	for(int j=0;j<A.length;j++){
//        		count += ((A[j]>>i) &1);
//        	}
//        	result = result | (count % 3)<<i; 
//        }
//		return result;
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumber sn = new SingleNumber();
		int aa[]= {3,3,3,2};
		System.out.println(sn.single(aa));

	}

}

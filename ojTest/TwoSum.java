package ojTest;

public class TwoSum {

	public int binarySearch(int[] numbers, int l,int index)
    {
        int i;
        for(i = l; i < numbers.length; i++)
        {
            if(index == numbers[i])
            {
                return i;
            }
        }
        
        return 0;
    }
    
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] res = new int[2];
        int i = 0;
        int a = 0;
        for(i = 0; i < len; i++)
        {
            int diff = target - numbers[i];
            if(diff <= 0)
            {
                continue;
            }
            else
            {
                a = binarySearch(numbers, i+1, diff);
                if(a == 0)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
        
        res[0] = i + 1;
        res[1] = a + 1;
        return res;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

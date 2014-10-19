package ojTest;

import java.util.ArrayList;

public class GrayCode {
	
	public static ArrayList<Integer> grayCode(int n) {
        int[] graySequence = new int[n];
        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean flag = true;
        getGrayCode(graySequence, 0, n, al,flag);
        
        for(int i = 0; i < al.size(); i++)
        {
        	System.out.print(" " + al.get(i));
        }
        return al;
    }
	
	public static void getGrayCode(int[] graySequence, int depth, int maxDepth, ArrayList<Integer> al,boolean flag) 
	{
		if(depth == maxDepth)
		{
			al.add(getCode(graySequence));
			return;
		}
		
		if(flag)
		{
			graySequence[depth] = 0;
			getGrayCode(graySequence, depth+1,maxDepth,al,!flag);
			
			graySequence[depth] = 1;
			getGrayCode(graySequence, depth+1,maxDepth,al,!flag);
		}
		else
		{
			graySequence[depth] = 1;
			getGrayCode(graySequence, depth-1,maxDepth,al,!flag);
			graySequence[depth] = 0;
			getGrayCode(graySequence, depth-1,maxDepth,al,!flag);
		}
	}
	
	public static int getCode(int[] num)
	{
		int index = 1;
		int ret = 0;
		for(int i = num.length - 1; i >= 0; i--)
		{
			ret += num[i] * index;
			index *= 2;
		}
		
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grayCode(2);
	}

}

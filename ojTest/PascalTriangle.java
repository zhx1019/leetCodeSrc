package ojTest;
import java.util.ArrayList;

public class PascalTriangle {
	
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> pascalTr = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < numRows; i++)
        {
        	int a;
        	int b;
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	for(int j = 0; j <= i; j++)
        	{
        		if(i <= 1)
        		{
        			list.add(1);        	
        		}
        		else
        		{
        			if(j == 0 || j == i)
        			{
        				list.add(1);
        			}
        			else
        			{
        				a = pascalTr.get(i - 1).get(j -1);
        				b = pascalTr.get(i - 1).get(j);
        				list.add(a+b);
        			}
        		}
        	}	
        	pascalTr.add(list);     	
        	
        }
        
        /*for(int i = 0; i < pascalTr.size(); i++)
        {
        	for(int j = 0; j < pascalTr.get(i).size(); j++)
        	{
        		System.out.println(pascalTr.get(i).get(j));
        	}
        }*/
        return pascalTr;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle pt = new PascalTriangle();
		ArrayList<ArrayList<Integer>> pa = new ArrayList<ArrayList<Integer>>();
		pa = pt.generate(5);
	}

}

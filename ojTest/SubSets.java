package ojTest;

import java.util.ArrayList;

public class SubSets {
	
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> arrlist = new ArrayList<ArrayList<Integer>>();
        shellSort(S);
        findSubSets(S, list, arrlist,0);
        return arrlist;
    }
	
	void shellSort(int[] S)
	{
		for(int inc = S.length / 2; inc > 0; inc /= 2)
		{
			
			/*for(int j = inc; j < S.length; j++)
			{
				int Tmp = S[j];
				int i;
				for(i = j; i >= inc; i -= inc)
				{
					if(Tmp < S[i - inc])
						S[i] = S[i - inc];
					else
						break;
				}
				S[i] = Tmp;
			}*/
			
			/*for(int j = 0; j+inc < S.length; j++)
			{
				int i = 0;
				int tmp = S[j];
				for(i = j; i + inc < S.length; i+=inc)
				{
					if(S[i] > S[i+inc])
					{
						S[i] = S[i+inc];
					}
					else
					{
						break;
					}
				}
				tmp = S[i];
			}*/
			
			for(int j = inc; j < S.length; j++)
			{
				int i;
				int tmp = S[j];
				for(i = j; i >= inc; i -= inc)
				{
					if(S[i] < S[i - inc])
					{
						S[i] = S[i - inc];
					}
					else
					{
						break;
					}
				}
				S[i] = tmp;
			}
		}
	}
	
	void findSubSets(int[] S, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> arrlist, int depth)
	{
		if(depth == 3)
		{
			arrlist.add(new ArrayList<Integer>(list));
			return;
		}
				
		ArrayList<Integer> tmp = new ArrayList<Integer>(list);
		findSubSets(S, tmp, arrlist,depth+1);
		tmp.add(S[depth]);
		findSubSets(S, tmp, arrlist,depth+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSets ss = new SubSets();
		int[] a = {4,1,0};
		
		ArrayList<ArrayList<Integer>> arrlist = ss.subsets(a);
		int a1 = a.length;
		for(int i = 0; i < arrlist.size(); i++)
		{
			for(int j = 0; j < arrlist.get(i).size(); j++)
			{
				System.out.print(arrlist.get(i).get(j));
			}
			System.out.println();
		}
	}

}

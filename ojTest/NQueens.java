package ojTest;

import java.util.ArrayList;

public class NQueens {

	public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> as = new ArrayList<String[]>();
        int[] queueList = new int[n];
        permutation(queueList,0,n,as);
        return as;
    }
    
    public void permutation(int[] queueList, int depth, int n, ArrayList<String[]> as)
    {
        if(depth == n)
        {
            String[] ss = new String[n];
            char[] str = new char[n];
            for(int i = 0; i < n; i++)
            {
                str[i] = '.';
            }
            
            for(int i = 0; i < n; i++)
            {
                str[queueList[i]] = 'Q';
                ss[i] = new String(str);
                str[queueList[i]] = '.';
            }
            
            as.add(ss);
            return;
        }
        
        for(int i = 0; i < n; i++)
        {
            if(isSafe(queueList, depth, i)) {
                queueList[depth] = i;
                permutation(queueList, depth+1, n,as);
            }
        }
        
    }
    
    public boolean isSafe(int[] queueList, int row, int col)
    {
        for(int preRow = 0; preRow < row; preRow++)
        {
            int preCol = queueList[preRow];
            
            if(preRow == row)
            {
                return false;
            }
            
            if(preCol == col)
            {
                return false;
            }
            
            if(row - preRow == col - preCol)
            {
                return false;
            }
            
            if(row + col == preRow + preCol)
            {
                return false;
            }
        }
        
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

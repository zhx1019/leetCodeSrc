package ojTest;

public class MinimumPathSum {
	
	public static int minPathSum(int[][] grid) {
        if(grid == null)
        {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] sum = new int[rows][cols];
        int tmp = 0;
        for(int i = rows - 1; i >= 0; i--)
        {
            sum[i][cols-1] = tmp + grid[i][cols-1];
            tmp += grid[i][cols - 1];
            System.out.print(" "+sum[i][cols-1]);
        }
        
        tmp = 0;
        for(int i = cols - 1; i >= 0; i--)
        {
            sum[rows-1][i] = tmp + grid[rows-1][i];
            tmp += grid[rows-1][i];
            System.out.print(" "+sum[rows - 1][i]);
        }
        
        for(int i = rows - 2; i >= 0; i--)
        {
            for(int j = cols - 2; j >= 0; j--)
            {
            	int a = 0;
            	if(grid[i+1][j] > grid[i][j+1])
            	{
            		a = grid[i][j+1];
            	}
            	else
            	{
            		a = grid[i+1][j];
            	}
            	
                sum[i][j] = grid[i][j] + (grid[i+1][j] > grid[i][j+1] ? grid[i][j+1] : grid[i+1][j]);
                System.out.print(" "+sum[i][j]);
            }
            
            System.out.println();
        }
        
        return sum[0][0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]  a = {{1,2},{1,1}};
		System.out.println(minPathSum(a));
		
	}

}

package ojTest;

public class MergeSortArray {

	static void merge(int A[], int m, int B[], int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] b = new int[m+n+1];
        while(i <= m - 1 && j <= n - 1)
        {
            if(A[i] <= B[j])
            {
                b[k++] = A[i++];
            }
            else
            {
                b[k++] = B[j++];
            }
        }
        
        while(i <= m-1)
        {
            b[k++] = A[i++];
        }
        
        while(j <= n-1)
        {
            b[k++] = B[j++];
        }
        
        for(k = 0; k < m + n; k++)
        {
            A[k] = b[k];
            System.out.println(A[k]);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {};
		int[] b = {1};
		merge(a,a.length,b,b.length);
	}

}

package ojTest;

import java.util.LinkedList;

public class PermutationSequence {

	public static String getPermutation(int n, int k) {
	
		if(k <= 0 || n <= 0)
		{
			return new String();
		}
		k = k - 1;
		LinkedList<Character> ll = new LinkedList<Character>();
		StringBuffer res = new StringBuffer();
		for(int i = 0; i < n; i++)
		{
			ll.add((char) (i + '1'));
		}
		
		int totalNum = 1;
		for(int i = 1; i <= n; i++)
        {
            totalNum *= i;
            
        }
		
		int index = 0;
		int p = 0;
		
		while(index < n)
		{
			totalNum = totalNum / (n-index);
			p = k / totalNum;
			char c = ll.get(p);
			res.append(c);
			ll.remove(p);
			k = k % totalNum;
			
			index++;
		}
		
		return res.toString();
	}
	
	 /*public static String getPermutation(int n, int k) {  
	        // Start typing your Java solution below  
	        // DO NOT write main() function  
	        if(k<0) return new String();  
	          
	        k = k-1;  
	          
	        LinkedList<Character> can = new LinkedList<Character>();  
	        for(int i=0; i<n;i++) {  
	            can.add( (char)(i+'1') );  
	        }  
	          
	        char[] res = new char[n];  
	        int i=0;  
	        int p=0;  
	          
	        while(i<n) {  
	            int f = getFactorial(n-i-1);  
	            p = k/f;  
	            res[i++] = can.get(p);  
	            can.remove(p);  
	            k = k % f;   
	        }  
	          
	        return new String(res);  
	    }  
	      
	    private static int getFactorial(int n) {  
	        if(n==0) return 1;  
	        int x = n;  
	        while(--n>0) x *= n;  
	        return x;  
	    }  */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getPermutation(4,22));
	}

}

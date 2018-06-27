package interview;

public class Power {
	
public static int power(int x, int n, int d)
{
	    // Do not write main() function.
	    // Do not read input, instead use the arguments to the function.
	    // Do not print the output, instead return values as specified
	    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details

		long  result = 1;
	    boolean flag = false;
	    
	    if(x == 0){
	        return 0;
	    }
	    if(n == 0){
	        return 1;
	    }
	    
	    if(x < 0){
	        x = Math.abs(x);
	        if(n%2 != 0)
	        {
	            flag=true;
	        }
	    }
	    
	    
	    
	    long val = x%d;
	    
	    while(n != 0){
	        if(n%2 != 0){
	            result = (result*val)%d;
	        }
	        
	        val = (val *val)%d;
	       
	        
	        n = n/2;
	        if(result > d){
	            result = result%d;
	        }
	    }
	    
	    if(flag){
	        return d-(int)result;
	    }
	    
	    return (int)result;
	}
	
	public static void main(String args[])
	{
		int result = power(2,3,3);
		System.out.print(result);
	}

}

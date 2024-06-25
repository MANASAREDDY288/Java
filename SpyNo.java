package programs;

public class SpyNo {
	
	/* If sum of digits of a given number is equal to the product
	  of digits of a given number then that number is known as spy number */
	 /*eg: 321
	   sum=3+2+1=6
	   product=3*2*1=6 */
	
	public static void main(String[] args) {
		int n=321;
		int sum=0;
		int prod=1;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+digit;
			prod=prod*digit;
			n=n/10;
		}
		if(sum==prod)
		{
			System.out.println("is spy number");
		}
		else
		{
			System.out.println("is not spy number");
		}
		
	}
	  
	

}

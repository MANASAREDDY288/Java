package programs;

public class Factorial {
	/* the product of decreasing order of a given number 
	 is known as factorial of a number*/
	
	public static void main(String[] args) {
		int n=5;
		int prod=1;
		for(int i=n;i>=1;i--)
		{
			prod=prod*i;
		}
		System.out.println("The factorial of n+ is:"+prod);
	}
	 

}

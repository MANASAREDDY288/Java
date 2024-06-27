package programs;

public class FibonacciSeries {
	/* Fibonacci series always starts from 0 and 1
	 Addition of previous two fibonacci numbers is the next fibonacci number 
	 in the fibonacci series */
	public static void main(String[] args) {
		int n=10;
		int a=0,b=1;
		int sum=0;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
		}
	}

}

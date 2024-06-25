package programs;

public class palindromeNo {
	/* If the reversing order of the given number is equal to the number itself then that 
	 number is known as palindrome number*/
	public static void main(String[] args) {
		int n=1221;
		int org_n=n;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		if(org_n==rev)
		{
			System.out.println(org_n+" "+"is palindrome number");
		}
		else
		{
			System.out.println(org_n+" "+"is not palindrome number");
		}
	}
	 

}

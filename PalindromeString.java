package programs;

public class PalindromeString {
	public static void main(String[] args) {
		String s="MALAYALAM";
		String org_s=s;
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(org_s.equals(rev))
		{
			System.out.println(org_s+" "+"is palindrome string");
		}
		else
		{
			System.out.println(org_s+" "+"is not palindrome string");
		}
				
				
	}

}

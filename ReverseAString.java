package programs;

public class ReverseAString {
	public static void main(String[] args) {
		String s="MANASA";
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string is:"+rev);
	}

}

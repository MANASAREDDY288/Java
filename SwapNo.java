package programs;

public class SwapNo {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("before swapping:"+a+" "+b);
		
		//using 3rd variable
		
		int temp=a;
		a=b;
		b=temp;
		
		//Without using 3rd variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping:"+a+" "+b);
	}

}

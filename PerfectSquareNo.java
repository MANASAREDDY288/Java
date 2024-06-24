package programs;

public class PerfectSquareNo {
	//The given number is square of any other number then that number is known as perfect square number
	public static void main(String[] args) {
		int n=9;
		int pos=0;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				pos=i*i;
			}
		}
		if(pos==n)
		{
			System.out.println(n+" "+"is perfect square number");
		}
		else
		{
			System.out.println(n+" "+"is not perfect square number");
		}
	}

}

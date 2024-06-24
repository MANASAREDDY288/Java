package programs;

public class PerfectNo {
	/*If sum of factors of a given number is equal to the number itself
then that number is called as perfect number*/
	public static void main(String[] args) {
		int n=6;
		int sof=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sof=sof+i;
			}
		}
		if(sof==n)
		{
			System.out.println(n+" "+"is perfect number");
			
		}
		else
		{
			System.out.println(n+" "+"is not perfect number");
		}
	}
	
	
	

}

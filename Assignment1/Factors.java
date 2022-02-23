import java.util.*;

class Factors
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no...");
		
		int no = sc.nextInt();
		
		for(int i=1; i<=no; i++)
		{
			if(no%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
		
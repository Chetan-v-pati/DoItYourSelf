import java.util.*;

class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no...");
		
		int no = sc.nextInt();
		int temp = 1;
		
		for(int i=1; i<=no; i++)
		{
			temp = temp*i;
		}
		
		System.out.println(temp);
	}
}
			
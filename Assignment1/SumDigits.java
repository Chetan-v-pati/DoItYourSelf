import java.util.*;

class SumDigits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		
		int no = sc.nextInt();
		int sum=0;
		int temp;
		
		while(no>0)
		{
			temp = no%10;
			sum = sum + temp;
			no = no/10;
		}
		System.out.println(sum);
	}
}
			
		
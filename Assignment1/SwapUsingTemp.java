import java.util.*;

class SwapUsingTemp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
	
		
		int no1 = sc.nextInt();
		System.out.println("1st no is " +no1);
		int no2 = sc.nextInt();
		System.out.println("2nd no is " +no2);
		int temp;
		
		temp=no1;
		no1=no2;
		no2=temp;
		
		System.out.println("Swapped first no is " +no1);
		System.out.println("Swapped Second no is " +no2);
		
	}
}
		
		
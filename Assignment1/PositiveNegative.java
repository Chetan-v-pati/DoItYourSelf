import java.util.Scanner;

class PositiveNegative
{
public static void main(String args[])
{
	System.out.println("Enter your given no...");
	Scanner sc = new Scanner(System.in);
	
	int no = sc.nextInt();
	
	if(no>0)
	{
		System.out.println("Given no is positive number...");
	}
	else if(no<0)
	{
		System.out.println("Given no is negative number...");
	}
	else
		System.out.println("Given no is zero");
}
}
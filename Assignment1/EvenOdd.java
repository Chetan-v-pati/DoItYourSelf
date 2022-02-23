import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
	System.out.println("Enter your given number...");
	Scanner sc = new Scanner(System.in);
	
	int no = sc.nextInt();
	
	if(no%2==0)
	
		System.out.println("The given no is Even number");
	
		else
			System.out.println("The given no is Odd number");
}
}
import java.util.*;
class Swap1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first no -");  //20
	int a = sc.nextInt();
	
	System.out.println("Enter the second no -");  //10
	int b = sc.nextInt();
	
	System.out.println("Before Swapping nos");
	System.out.println("The first no is " +a+ " and second no is " +b );
	
	a = a * b;   // a = 200
	b = a / b;   // b = 20
	a = a / b;   // a = 10
	
	System.out.println("After Swapping nos");
	System.out.println("The first no is " +a+ " and second no is " +b );
	
}
}
import java.util.*;

class DigitsView
{
public static void main(String args[])
{
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter your number");
	
	int no = sc.nextInt();
	int temp;
	
	while(no>0)
	{
		temp = no%10;
		no = no/10;
		System.out.println(temp);
	}
}
}
import java.util.Scanner;

public class Factorial {
	public static void factorial(int number)			//Performs the factorial
	{
		int i;
		int facto=1;
		for (i=1;i<=number;i++)
			facto=facto*i;
		System.out.println("The factorial is :"+facto);
	}

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for finding factorial:\n");
		num=sc.nextInt();
		sc.close();
		factorial(num); 					//Calling method

	}

}

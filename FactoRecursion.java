import java.io.*;
import java.util.Scanner;
public class FactoRecursion {

	public static int factorial(int num)
	{
	return (num==1) ? 1 : num*factorial(num-1);			//Recursive Fuction return statement. Returns 1 if num becomes 1 , if not then it multiple num with num-1 and that again with num-1-1 then again num-1-1-1 like this way.
	}
	public static void main(String[] args) throws IOException
	{	System.out.println("Enter the number whose factorial you wanna find");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int facto=factorial(number);
		System.out.println(facto);
		sc.close();

	}

}

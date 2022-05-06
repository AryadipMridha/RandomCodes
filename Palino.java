import java.util.Scanner;
public class Palino
	{
		public static void main(String[] args)
		{
			String original, reverse="";
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the nember or word to check\n");
			original=sc.nextLine();
			sc.close();							//Inputs are taken
			
			
			int length=original.length();		//Main logic occurs
			for (int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
			
			
			if (original.equals(reverse))		//Checking
				System.out.println("The number/String is palindrome.");
			else
				System.out.println("The number String is not palindrome.");
			
			
		}
	}
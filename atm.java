import java.util.Scanner;
public class atm {
	
	public static void MBwithdraw(int amt)
	{
		int bal=100000;
		if(amt>bal)
			System.out.println("\nInsufficent Funds");
		else
			{System.out.print("\nYour transcation is being processed...");
			bal=bal-amt;
			System.out.print("\nYour current balance is:"+bal);
			System.out.print("\nServices Rendered via Maze Bank ATM , 21,Las Lagunas Blvd, Los Santos.");
			}
	}
	public static void MBdeposit(int amt)
	{
		int bal=100000;
		System.out.print("\nEnter the amout you wish to deposit");
		bal=bal+amt;
		System.out.print("\nYour current balance is:"+bal);
		System.out.print("\nServices Rendered via Maze Bank ATM , 21,Las Lagunas Blvd,Los Santos.");
		
	}
	public static void main(String[] args)
	{
		int Choice;
		int amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Maze Bank ATM");
		System.out.println("Choose 1 to withdraw, 2 to Deposit.");
		Choice=sc.nextInt();
		if(Choice==1)
		{	System.out.println("Enter the amount to withdraw:\n");
		amount=sc.nextInt();
		MBwithdraw(amount);
		}
		else if (Choice==2)
		{
		System.out.println("Enter the amount to deposit.");
		amount=sc.nextInt();
		MBdeposit(amount);
		}
		else
			System.out.println("Wrong Choice");
	    sc.close();
	}
	
		
		
	}


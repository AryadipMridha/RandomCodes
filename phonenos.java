import java.util.Scanner;
import java.util.Arrays;
public class phonenos

	{
		public static void main(String[]args)
			{
				System.out.println("Enter the total number of indivisual :\n");
				Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
				long arrname[]=new long[size];
				System.out.println("Enter the Phone numbers one by one;");
				for(int i=0;i<size;i++)
				arrname[i]=sc.nextLong();
				System.out.println("The phone numbers are as follows:"+Arrays.toString(arrname));
				sc.close();
			}
}

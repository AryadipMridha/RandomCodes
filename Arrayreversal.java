import java.util.Scanner;
public class Arrayreversal {
	public static void main(String[] args)
	{
		int size;
		int arryayy[];
		System.out.println("Enter the number of elements :");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		arryayy=new int[size];
		
		System.out.println("Enter the elements of array;");
		
		for(int i=0;i<size;i++)			//Array element are getting inputed 
		{
			arryayy[i]=sc.nextInt();
		}
		
		System.out.println("Original array in reverse order :");
		for (int i=size-1;i>-1;i--)
			System.out.print(arryayy[i]+" ");
		
	sc.close();
	}
	}

import java.io.*;
import java.util.*;
public class DivideAndPrint
{
	public static void main(String[] args) 	throws IOException	//Main Stub Opens here, User inputs are taken here.
	
	{	System.out.println("Enter the interval number:");
	Scanner sc=new Scanner(System.in);
	int interval=sc.nextInt();
	System.out.println("Enter the strings:");
	sc.nextLine(); //This sc.nextLine() states the sc object will take strings now onwards in the code
	
	
			
	for(int a=0;a<interval;a++)					//Charleap is basic the interval of charecter jump tthe user requested.
		{String userin=sc.nextLine();	
		char[] CharArray=userin.toCharArray();		//string is converted to char in array form
		int charlen=CharArray.length;				// in charlen we are saving length of the charArray elements
			for(int i=0;i<charlen;i++) 			// as lost length is going on loop is continued.
			{
				if(i%2==0)
			System.out.print(CharArray[i]);	//if the counter passes char len at even places those chars will be printed 
			}
			System.out.println(" ");    			// As soon as system completes the evens place it gives a space and now we're gonna put the odd places
		
			for(int j=0;j<charlen;j++)
			{	if(j%2!=0)
			System.out.print(CharArray[j]);
			}
			System.out.println();
			}
	
	
	sc.close();
	}

}

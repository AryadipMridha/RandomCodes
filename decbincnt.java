import java.util.*;
public class decbincnt 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the number :");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();			//num: a decimal num is taken in
		int remainder,temporarycount=0,maxcount=0;
		while(num>0)
		{
			remainder=num%2;
			num=num/2;
			if(remainder==0)
				temporarycount=0;
			else
			{
				temporarycount+=1;
				if(temporarycount>maxcount)
				{
					maxcount=temporarycount;
				}
			}
		}
		System.out.println(maxcount);
		
		/*char[] binaryarrayset=Integer.toBinaryString(num).toCharArray(); //now to take dec to bin and transform to array
		
		for(int i=0;i<binaryarrayset.length;i++)
		{
			if(binaryarrayset[i]=='0')
				temporarycount=0;
			
			else
				temporarycount+=1;
		}*/
		scan.close();
	}
}

import java.io.*;
import java.util.*;
public class MultiplicationTables {

	public static void Multiplication(int mult) {
		for(int i=1;i<=10;i++) {
		int prod=mult*i;
		System.out.println(mult+"x"+i+"="+prod);
	}

}
	public static void main(String[] args) throws IOException
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
	 Multiplication(num);
	
	sc.close();
}
}

	

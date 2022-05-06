import java.util.Scanner;
public class registrar {

	public static void main(String[] args) {
		int i;
		String str[]=new String[4];
		System.out.println("Enter the names(Max Limit 3)");
		Scanner sc=new Scanner(System.in);
		for (i=1;i<4;i++)
			str[i]=sc.nextLine();
		sc.close();
		System.out.println("The names entered are as follows:\n");
		int len=str.length;
		for(int j=1;j<len;j++)
			System.out.println(str[j]);
		
	}

}

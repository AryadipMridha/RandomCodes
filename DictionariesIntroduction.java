import java.io.*;
import java.util.*;
import java.util.Scanner;
public class DictionariesIntroduction {

	public static void main(String[] argh) throws IOException
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of dictionary:");
		Map<String,Integer> Userbase=new HashMap<String,Integer>();		//Here i initialised a map statement ,tbn the<>contain datatypes as full names.user base is the name of hashmap.
		int n=obj.nextInt();											//I am taking n from user to ensure how many entries he/she wanna make.
																		// obj is now set to take Integer , this line is intanced so before taking strings we would write obj.next()
																		//Dictionary to filled now
		for(int i=0;i<n;i++)
		{
			String names=obj.next();									//taking  names
			int phonenum=obj.nextInt();									//We need to Integer.parseInt because obj has already taking and set to take string , so if we wanna take other datatype we need to parse it , using the syntax. 
			obj.nextLine();												// this line is fixed to take string now.
			Userbase.put(names,phonenum);								//Putting the values as keys and values,<COLOUR,Red>Colour is keys and Red is values , liuke this way.
		}																//Dictionary fill-up is done
																		//Now we are gonna search up as per users wish
		System.out.println("Enter the name you want to search:");
		while(obj.hasNext())
		{
			String userrequest=obj.next();								 //User input is keys
			if(Userbase.containsKey(userrequest))						 //checking the user requested key if found does follows up
			System.out.println(userrequest+"="+Userbase.get(userrequest));//if found it return the respected value of the key
			else 
				System.out.println("Not Found");
		}
		obj.close();													
		
		
		
	}

}

import java.util.Scanner;

class reverstr
{
    public static void reverser(String string) {
        StringBuilder str=new StringBuilder(string);
        StringBuilder revstr=str.reverse();
        System.out.println(revstr);
        
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String mystr=scanner.nextLine();
        reverser(mystr);
        scanner.close();
    }
}
import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("Enter string:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("The reversed string is:");
        System.out.println(sb.reverse().toString());
    }
}
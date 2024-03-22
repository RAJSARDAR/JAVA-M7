import java.util.Scanner;

public class AlphabetChecker2 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a character :");
char ch = scanner.next().charAt(0);

System.out.println (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? ((ch >= 'A' && ch <= 'Z') ? "UpperCase Alphabet" : "LowerCase Alphabet" ) : "not an alphabet" ) ;

}
}
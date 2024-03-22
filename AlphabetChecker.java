import java.util.Scanner;

public class AlphabetChecker 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a character :");
char ch = scanner.next().charAt(0);

boolean alphabet = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
boolean upperCase = (ch >= 'A' && ch <= 'Z');

String result = alphabet ? (upperCase ? " uppercase and alphabet " : " lowercase and alphabet ") : "not an alphabet";
System.out.println(ch + " is " + result + ".");

}
}
import java.util.Scanner ;
class VowelCheck
{
public static void main (String [] args)
{

Scanner sc = new Scanner (System.in);
System.out.print ("Enter your name :");

String name = sc.next();
char ch = name.charAt(0);

boolean vowel = (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch=='u' || ch == 'A' || ch =='E' || ch =='I' || ch =='O' || ch=='U' ) ;

String check  = vowel ? " vowel " : " consonant " ;

 System.out.println("Character " + ch + " is a " + check + ".");




}


}
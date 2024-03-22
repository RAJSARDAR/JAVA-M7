import java.util.Scanner ;
class Vowel
{
public static void main (String [] args)
{

Scanner sc = new Scanner (System.in);
System.out.print ("Enter your name :");

String name = sc.next().toLowerCase;
char ch = name.charAt(0);

System.out.println("Hello my same is "+name +"and my frist letter is "+ch);


if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch=='u')
{
 System.out.println("Character "+ch+"is a vowel .");

}else
{

 System.out.println("Character "+ch+"is a consonent .");
}


}


}
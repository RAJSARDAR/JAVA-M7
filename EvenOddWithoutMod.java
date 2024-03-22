import java.util.Scanner

class EvenOddWithoutMod
{
public static void main (String [] args)

Scanner sc = new Scanner (System.in);
System.out.print(" Enter a number : ");
{
 int num = sc.Int() ;
System.out.println (((num/2)*2==num)?"Even" : "Odd") ;
//System.out.println (((num/2.0)*2==(num/2))?"Even" : "Odd") ;
}


}
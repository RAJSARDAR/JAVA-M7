import java.util.Scanner ;
class CheckDigit
{
public static void main (String [] args)
{


Scanner sc = new Scanner (System.in);
System.out.print("Enter the digit : ");

int digit =sc.nextInt();
System.out.println((digit>='0'&&digit<'9') ? "is digit" : "is not digit");

}

}
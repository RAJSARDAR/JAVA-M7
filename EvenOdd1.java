import java.util.Scanner ;
class EvenOdd1 
{

public static void main (String [] args) 

{
Scanner sc = new Scanner (System.in) ;
System.out.println (" Enter a number : ") ;

int num = sc.nextInt();
System.out.println((num%2==0)?num+"Number is even " : num + "Number is odd ");
}

}
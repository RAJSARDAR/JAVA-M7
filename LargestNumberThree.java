import java.util.Scanner ;
class LargestNumberThree

{
public static void main (String [] args)
{


Scanner sc = new Scanner (System.in);

System.out.print("Enter the number 1 : ");
int num1 = sc.nextInt() ;

System.out.print("Enter the number 2 : ");
int num2 = sc.nextInt() ;

System.out.print("Enter the number 3 : ");
int num3 = sc.nextInt() ;


int max = num1 ;
max = (num2>max)?num2:max ;
max = (num3>max)?num3:max ;

System.out.println("Largest among " +num1+ "," + num2 + " and " + num3 + " is "+ max);


}

}
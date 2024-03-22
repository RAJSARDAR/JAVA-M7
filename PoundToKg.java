import java.util.Scanner ;
class PoundToKg
{

public static void main (String [] args)
{

Scanner sc = new Scanner (System.in);
System.out.print(" Enter a number in pounds :");
double pound = sc.nextDouble();

double total = pound*0.454 ;
System.out.println(+ pound + " pound is " +total + " kilogram ");


}
}
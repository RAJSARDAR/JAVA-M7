import java.util.Scanner ;
class Acceleration
{

public static void main (String [] args)
{

Scanner sc = new Scanner (System.in);
System.out.print(" Enter a starting velocity in meter / sec :");
double v1 = sc.nextDouble();

System.out.print(" Enter a ending velocity in meter / sec :");
double v0 = sc.nextDouble();

System.out.print(" Enter the time span in sec :");
double t = sc.nextDouble();


double sub= ( v0-v1 )  ; 
double total = sub / t ; 



System.out.println("The average acceleration is " + total );




}
}
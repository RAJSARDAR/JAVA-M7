/* Assume a runner runs 14km in 45 minutes and 30sec . Write a program that displays the average speed in miles per hour  (Note that 1 mile is 1.6km) */

class Average
{
public static void main(String [] args)
{
double km = 14d ;
final double oneMileIs = 1.6 ;
final double time = (45*60)+30;
final double secInHour = 3600;
final double mile = km/oneMileIs;

double speedInMiles = mile / (time / secInHour ) ;

System.out.println("The average speed in miles per hour is : "+speedInMiles );


}


}


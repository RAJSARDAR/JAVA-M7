import java.util.Scanner ;
class MinuteToYear
{

public static void main (String [] args)
{

Scanner sc = new Scanner (System.in);
System.out.print(" Enter a number of minutes :");
long minutes = sc.nextLong();

long year = minutes / 525600 ; // 60x24x365 = 525600

//int day = 

System.out.println(+ minutes + " minutes is approximately  : " + year + "years and " );


//+ day + "days .");


}
}
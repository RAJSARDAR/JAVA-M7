import java.util.Scanner ;

class Runway
{
public static void main(String[] args)
 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed  :");
		double v = sc.nextDouble();

		System.out.println("Enter the acceleration :");
		double a = sc.nextDouble();

		double length = (v*v) / (2*a) ;
		System.out.println("The minimum runway lengthh is " + length);
	}
}

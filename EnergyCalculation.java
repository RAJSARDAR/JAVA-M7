import java.util.Scanner ;

class EnergyCalculation
{
public static void main(String[] args)
 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilogram :");
		double M = sc.nextDouble();

		System.out.println("Enter the Initial temperature :");
		double initialTemp = sc.nextDouble();

		System.out.println("Enter the Final temperature :");
		double finalTemp = sc.nextDouble();

		double total = M* ( finalTemp - initialTemp) * 4148 ;
		System.out.println("The energy needed to heat water is " + total + " joules ");
	}
}

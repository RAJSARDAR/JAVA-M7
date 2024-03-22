import java.util.Scanner ;

class DrivingCost
{
public static void main(String[] args)
 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the driving distance :");
		double distance = sc.nextDouble();

		System.out.println("Enter miles per gallon :");
		double miles = sc.nextDouble();

		System.out.println("Enter price per gallon:");
		double price = sc.nextDouble();

		double cost =( distance / miles ) * price ;
		System.out.println("The cost of driving is " + " $ " + cost );
	}
}


import java.util.Scanner ;

class BmiCalc
{
public static void main(String[] args)
 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pound  :");
		double weight = sc.nextDouble();

		System.out.print("Enter height in inches :");
		double height = sc.nextDouble();

		double kg = weight * 0.45359237 ;
		double meter = height * 0.0254 ;

		double bmi = kg / (meter * meter)  ;
		System.out.println("The BMI  is " + bmi);
	}
}


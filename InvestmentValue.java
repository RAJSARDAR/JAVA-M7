import java.util.Scanner ;

class InvestmentValue
{
public static void main(String[] args)
 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Investment amount :");
		double investmentAmount = sc.nextDouble();

		System.out.println("Enter annual interest rate  :");
		double annualInterest = sc.nextDouble();

		System.out.println("Enter number of years:");
		double years = sc.nextDouble();

		// double accumulatedValue = investmentAmount *(1+annualInterest) * (years*12) ;                  ;
		System.out.println("The Accumulated value is " + " $ " + accumulatedValue );
	}
}

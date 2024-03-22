import java.util.Scanner ;

class NaturalNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in ) ;

		System.out.print("Enter the number : ");
		double number = sc.nextDouble() ;

		if (0<number)
		{
			System.out.println("The number is Positive ");
		}

		else

		{
			System.out.println("The number is Negative : ");
		}
	}
}
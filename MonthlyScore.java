import java.util.Scanner ;

class MonthlyScore
{
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	System.out.print("Enter the pay amount :");
	double amount = sc.nextDouble() ;


	System.out.print("Enter your monthly target score :");
	int target = sc.nextInt() ;

	if ( target > 90 )
	{

		System.out.println("Increases the pay of employee by 3% : "+(amount+amount*3/100));
	}
	else 
	{
		System.out.println("Increases the pay of emoployee by 1% : "+ (amount+amount*1/100));
	}

}
}
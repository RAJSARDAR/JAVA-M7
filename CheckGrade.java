import java.util.Scanner ;
class CheckGrade 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;

		System.out.print("Enter your percentage : ");
		double percentage = sc.nextDouble() ;

		if(percentage =<35 )
			System.out.println("GALI");
		else if (percentage >60 || percentage <= 75 )
			System.out.println("First class with B Grade");

		else if (percentage >35 || percentage <=60 )
			System.out.println("First class with A+ Grade");


else if (percentage >75 || percentage <= 90 )
			System.out.println("First class with A Grade");

		else if (percentage >90 || percentage <= 100 )
			System.out.println("First class with Distinion with O Grade");





	} 
}

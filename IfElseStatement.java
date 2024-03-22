import java.util.Scanner ;
class EligibalityToMarry
{
	public static void main(String[] args) 

	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter your age : ") ;
		int age = sc.nextInt() ;

		System.out.print("Enter your property : ") ;
		int property = sc.nextInt() ;

		System.out.print("Enter your surname : ") ;
		String surname = sc.next().toUpperCase() ;
	
	if ((age >=21 && property >= 10000000 ) || ( surname.equals ("AMBANI")))
	{
		System.out.println("You are eligible");
	}
	else
	{
		System.out.println("You are not eligible");

	
	}

	}
}
import java.util.Scanner ;

class Interview
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter your percentage :");
		int percentage = sc.nextInt();

		if(percentage>60)
		{
			System.out.println("Your percentage is " + percentage + " , so you are ELEGIBLE for Interview ");
		}
		else
		{
			System.out.println("Your percentage is " + percentage + " , so you are NOT ELEGIBLE for Interview ");
		}
	}
}

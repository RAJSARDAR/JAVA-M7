import java.util.Scanner ;

class Interest
{
  public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the Balance: ");
		double balance= sc.nextDouble();

	    System.out.print("Enter the Intereset Rate: ");
	    double interestRate= sc.nextDouble();

		double total = balance* (interestRate/1200);

		System.out.println("The Interest Is : "+ total);

    }
}
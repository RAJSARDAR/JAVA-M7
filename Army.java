import java.util.Scanner ;

class Army
{
	public static void main(String[] args)
	 {
		
		         Scanner s=new Scanner(System.in);
			System.out.print("Enter the Age: ");
			int age=s.nextInt();
					
			if(age>=18)
			{
				System.out.print("Enter your Height in cm : ");
				double height =s.nextDouble();
				if(height >=162)
				{
					
				  System.out.print("Enter Your Weight : ");
				  double weight=s.nextDouble();

				  if(weight>=56)
				   {
					  System.out.println("YOU ARE ELIGIBLE TO JOIN ARMY");

				   }
				   else
				    {
					   System.out.print("YOU ARE NOT ELIGIBLE TO JOIN ARMY");
	
				    }
				}
				else
				{
					System.out.println("YOU ARE NOT ELIGIBLE TO JOIN ARMY");
				}
			}
			else
				    {
					   System.out.print("YOU ARE NOT ELIGIBLE TO JOIN ARMY");
	
				    }		
	
}
}
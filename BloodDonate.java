import java.util.Scanner ;
class BloodDonate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter your age : ");
		int age = sc.nextInt();

		if(age>20)
		{
			System.out.println("Had you consume cigarette or alcohol in last 24 hours ? (yes/no)");
			String SmokeDrink = sc.next().toLowerCase();
			if(SmokeDrink.equals("yes"))

			{
				System.out.println("Enter your weight :");
				double weight = sc.nextDouble();

				if(weight>50)
				{
					System.out.println("YOU CAN DONATE");
				}

				else
				{
					System.out.println("YOU CAN NOT DONATE");
				}

			}
			 else 
			    {
					System.out.println("YOU CAN NOT DONATE");
				}


		}
		
	}
}
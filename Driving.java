import java.util.Scanner;

public class Driving {
	public static void main(String[] args) 
	{
		
		
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the Age : ");
			int age =s.nextInt();
			
			if(age >=18)
			{
				System.out.print("Enter your marks : ");
				double mar=s.nextDouble();
		

			
	
				if(mar>=60)
				{
					System.out.println("you are Eligible for Driving licences!!");
					
				}
				else
				{
					System.out.println("you are not eligible for Driving licences");
			}
		}
			else
			{
				System.out.println("you are not eligible for Driving licences");
				
			}
	}
}

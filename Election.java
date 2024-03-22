import java.util.Scanner ;
class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;

		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if (age>=18) {
			System.out.println("Do you have a voter id (yes / no ) : ");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
				System.out.println("****** WELCOME *****");
				System.out.println("1.BJP");
				System.out.println("2.CONGRESS");
				System.out.println("3.AAP");
				System.out.println("4.MNS");
				System.out.println("5.SHIVSENA");
				System.out.println("6.NCP");
				System.out.println("7.NOTA");

				System.out.println("Enter the option to vote for your fav party : ");
				String vote = sc.next().toUpperCase() ;

				if(vote.equals("BJP")){
					System.out.println("You have voted for BJP ");
				}

				else if(vote.equals("CONGRESS"))
				{
					System.out.println("You have voted for CONGRESS ");
				}

					else if(vote.equals("AAP"))
				 {
					System.out.println("You have voted for AAP ");
				 }

					else if(vote.equals("MNS"))
					{
					System.out.println("You have voted for MNS "); 
				    }

					else if(vote.equals("SHIVSENA"))
					{
					System.out.println("You have voted for SHIVSENA "); 
				}

					else if(vote.equals("NCP"))
					{
					System.out.println("You have voted for NCP ");
				}

					else if(vote.equals("NOTA"))
					{
					System.out.println("Thank you for wasting your vote ");
				} else {
					System.out.println("Invalid Input");
				}




			}else {
				System.out.println("Jaldi yaha se hato");

			}
		}else {
			System.out.println("You are not mature to vote try after " + (18-age) + "years .");
		}
	}
}
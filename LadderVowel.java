import java.util.Scanner ;
class LadderVowel
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;

		System.out.print("Enter your name  : ");
		
		String name = sc.next().toLowerCase();
        char ch = name.charAt(0);

        
 
    if (ch == 'a')
    {
    	System.out.println("Character "+ch+" is a vowel .");
    }
    else if (ch == 'e')
    {
    	System.out.println("Character "+ch+" is a vowel .");
    }
    else if (ch == 'i')
    {
    	System.out.println("Character "+ch+" is a vowel .");
    }
     else if (ch == 'o')
    {
    	System.out.println("Character "+ch+" is a vowel .");
    }
    else if (ch == 'u')
    {
    	System.out.println("Character "+ch+" is a vowel .");
    } 
    else  
    	System.out.println("Your Character " +ch+ " is consonent");
}
}
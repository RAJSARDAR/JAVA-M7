//write a java program to find area of a circle whose radius is 2.5cm 

class Population
{
public static void main (String [] args)

{

long current = 312032486 ;
long secInYear= 365*24*60*60 ;
long birthYear = (secInYear/7);
long deathYear = (secInYear/13) ;
long immigrant = (secInYear/45) ;
long total=(current +(birthYear-deathYear+immigrant)*5);

System.out.println("Current Population  is :" + current );

System.out.println("Population after 5 years is :" + total);


}

}
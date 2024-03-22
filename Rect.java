/*Write a program that display area and perimeter of rectangle with the width of 4.5 and height of 7.9 using the following formula*/

class Rect
{

public static void main(String [] args )
{

double width= 4.5;
double height = 7.9;
double area = width*height ;
double perimeter = 2*(width*height);

System.out.println("The given width is :"+width);
System.out.println("The given height is :"+height);
System.out.println("The area of rectangle is :"+area);
System.out.println("The perimeter of rectangle is :"+ perimeter );



}
}
import java.util.Scanner;


class AreaOfRectangle

{
public static void main(String args[])

{
float a;
float b;


Scanner sc =new Scanner(System.in);
System.out.println("Enter Breath::");
a=sc.nextFloat();



System.out.println("Enter length::");
b=sc.nextFloat();


float ans=a*b;
System.out.println("AREA OF RECTANGEl " +a+ "*" +b+  "  is  "  +ans);

float ans2=2*(a+b);

System.out.println("PERIMETER IS 2 ("+a+ "+" +b+  ")  =  "  +ans2);
}

}
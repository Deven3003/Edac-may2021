import java.util.Scanner;

class Circle
{
public static void main()
{
float r;

float ans=3.1414*r*r;
float ans2=2*3.1414*r;

Scanner sc =new Scanner(System.in);
System.out.println("Enter Radius::");
r=sc.nextFloat();

System.out.println("AREA::" +ans);
System.out.println("PERIMETER::" +ans2);

}

}
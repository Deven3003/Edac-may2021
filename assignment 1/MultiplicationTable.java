import java.util.Scanner;

class MultiplicationTable
{
public static void main(String args[])
{
int i,j,ans;
int count;



Scanner sc =new Scanner(System.in);
System.out.print("Input NO=");
count=sc.nextInt();

for(i=1;i<=10;i++)
{
ans=i*count;
System.out.println("8 X "+i+"=" +ans);
 

}
}


}
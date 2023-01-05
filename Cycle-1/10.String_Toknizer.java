import java.util.Scanner;
import java.util.StringTokenizer;
class string_t{
public static void main(String args[])
{
System.out.println("Enter a line of integers");
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
StringTokenizer st=new StringTokenizer(input," ");
int sum=0;
while(st.hasMoreTokens())
{
int val=Integer.parseInt(st.nextToken());
sum=sum+val;
System.out.println(val);
}
System.out.println("sum is "+ sum);
}
}

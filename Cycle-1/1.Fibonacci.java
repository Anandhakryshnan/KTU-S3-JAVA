import java.util.Scanner;
public class fibonacci 
{
	public static void main(String[] args)
		{
				System.out.print("Enter"+" The number : ");
			int i=0,a=0,b=1,c;
				Scanner input=new Scanner(System.in);
			int num=input.nextInt();
				System.out.println("\nThe Fibonacci Series is :");
				if(num==0)
					System.out.println("No number to show");
				else if(num==1)
					System.out.println(a);
				else
						{
						System.out.print(" "+a);
						System.out.print(" "+b);
							for(i=0;i<num-2;i++)
								{
									c=a+b;
									System.out.print(" "+c);
									a=b;
									b=c;
								}
						}
						System.out.println();
		}
}

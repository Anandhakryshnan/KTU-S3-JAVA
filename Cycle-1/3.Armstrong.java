import java.util.Scanner;
public class amstrong_check
{
	public static void main(String[] args)
	{
		int i=0,j,temp,rev=0;
			System.out.print("Enter"+" The number to check : ");
			Scanner input=new Scanner(System.in);
			int num=input.nextInt();
			j=num;
				while(num>0)
				{
					temp=num%10;
					rev=rev+(temp*temp*temp);
					num=num/10;
				}
				if(j==rev)
					System.out.println("The number is amstrong");
				else
					System.out.println("The number is not amstrong");
	}
	
}

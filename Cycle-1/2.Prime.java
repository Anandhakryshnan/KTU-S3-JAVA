import java.util.Scanner;
public class prime_check{
public static void main(String[] args) {	
		System.out.print("Enter"+" The number to check : ");
			Scanner input=new Scanner(System.in);
			int num=input.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}

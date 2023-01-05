import java.util.Scanner;
public class string_palendrome{
  public static void main(String[] args) {
	
	System.out.print("Enter a string : ");
		Scanner input=new Scanner(System.in);
	String str=input.nextLine();
	
    String reverseStr = "";
    
    int strLength = str.length();
    

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}

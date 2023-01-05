import java.util.Scanner;
public class string_fq{
	public static void main(String[] args){
		System.out.println("ENTER THE STRING");
		Scanner a=new Scanner(System.in);
		String str=a.nextLine();
		String b=" ";
		int len=str.length();
		for(int i=0;i<len;i++){
			int count=0;
			if(!b.contains(Character.toString(str.charAt(i))))
			{
				b=b+str.charAt(i);
				for(int j=0;j<len;j++){
					if(str.charAt(i)==str.charAt(j))
						count++;
				}
				System.out.println(str.charAt(i)+" is repeating "+count+" times");
				count=0;
			}
		}
	}
}

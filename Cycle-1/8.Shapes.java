import java.util.Scanner;
public class shape{
public static void main(String[] args){
	Scanner inp=new Scanner(System.in);
	System.out.print("enter your choice\n");
	System.out.print("1.Rectange\n2.Triangle\n3.Pentagon\n>>>");
		int choice=inp.nextInt();
		switch(choice){
			case 1 : Rectangle r=new Rectangle();
				System.out.println("Number of sides: "+r.noofsides());
			break;
			case 2 : Triangle t=new Triangle();
				System.out.println("Number of sides: "+t.noofsides());
			break;
			case 3 : Pentagon p=new Pentagon();
				System.out.println("Number of sides: "+p.noofsides());
			break;
			default : System.out.println("Invalid option");
		}
	}
}
class shpe{
	int noofsides(){return 0;}
	}
		class Rectangle extends shpe{
			int sides=4;
			int noofsides(){
				return sides;
			}
		}
class Triangle extends shpe{
	int sides=3;
		int noofsides(){
		return sides;
	}
}
class Pentagon extends shpe{
	int sides=5;
		int noofsides(){
		return sides;
	}
}

import java.util.Scanner;
public class Exce{
	public static void main(String[] args){
	opt op1=new opt(4,0);
	try{
		op1.divide();
	}
	catch(myException e){
	System.out.println("error:"+e.getMessage());
	}
	finally{
	System.out.println("custom exception printed");
	}
	}
	}
class opt{
	int a,b,s=0;
	opt(int x,int y){
	a=x;
	b=y;
	}
void divide() throws myException{
if(b==0)
	throw new myException();
	s=a/b;
	}
	}
class myException extends Exception{
myException(){
	super("division by 0");
	}
	}

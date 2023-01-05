import java.util.Scanner;
public class Matrixmulti{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i,j,a,b,x,y,k,sum;
		System.out.print("Enter number of Rows of matrix 1: ");
		i=input.nextInt();
		System.out.print("Enter number of Columns of matrix 1: ");
		j=input.nextInt();
		int mat1[][]=new int [i][j];
		System.out.println("Enter the ELEMENTS : ");
		for(a=0;a<i;a++){
			for(b=0;b<j;b++){
				mat1[a][b]=input.nextInt();
			}	
			System.out.println();
		}
		System.out.print("Enter number of Rows of matrix 2: ");
		x=input.nextInt();
		System.out.print("Enter number of Columns of matrix 2: ");
		y=input.nextInt();
		int mat2[][]=new int [x][y];
		System.out.println("Enter the ELEMENTS : ");
		for(a=0;a<x;a++){
			for(b=0;b<y;b++){
				mat2[a][b]=input.nextInt();
			}	
			System.out.println();
		}
		if (i!=y)
			System.out.println("MULTIPLICATION NOT POSSIBLE");
		else{
			System.out.println("The Product matrix is : ");
			for(a=0;a<i;a++){
				for(b=0;b<y;b++){
					sum=0;
					for(k=0;k<j;k++){
						sum+=mat1[a][k]*mat2[k][b];
					}
					System.out.print(sum+"   ");
				}
				System.out.println();
			}
		}
	}
}						

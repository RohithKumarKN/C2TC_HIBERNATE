package Arrays;
import java.util.Scanner;
public class TwoDimensionalArrayForMatrixMultiplication {

	public TwoDimensionalArrayForMatrixMultiplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the dimension");		
int rows=sc.nextInt();
		int columns=sc.nextInt();
		int[][]a=new int[rows][columns];
		int[][]b=new int[rows][columns];
		System.out.println("Enter the array A");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the array B");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int[][]c=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				c[i][j]=a[i][j]*b[i][j];
			}
		}
		System.out.println("Result Matrix is");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				
			System.out.print(c[i][j]+" ");
		}
			System.out.println();}
	}

}

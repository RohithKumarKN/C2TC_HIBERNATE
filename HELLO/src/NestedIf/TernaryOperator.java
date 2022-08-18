package NestedIf;
import java.util.Scanner;
public class TernaryOperator {

	public TernaryOperator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=0;
		max = a>b ? a>c? a:c:b>c ? b: c;
		System.out.println("Maximum is   "+max);
		
	}

}
 
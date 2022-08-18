package BitwiseOperator;
import java.util.Scanner;
public class LiftShift {

	public LiftShift() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("A=");
int a=sc.nextInt();
System.out.println("N=");
int n=sc.nextInt();
int b=a<<n;
System.out.println("B="+b);
	}

}

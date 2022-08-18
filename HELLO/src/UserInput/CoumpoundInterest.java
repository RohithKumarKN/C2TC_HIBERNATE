package UserInput;
import java.util.Scanner;
public class CoumpoundInterest {

	public CoumpoundInterest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Principal=");
int Principal=sc.nextInt();
System.out.println("Interest rate=");
float Interest=sc.nextFloat();
System.out.println("N=");
float N=sc.nextFloat();

	double a=((1+(Interest/N )));
	double b=(Math.pow(a,N));
	System.out.print("Ending Amount" +(b*Principal));
	}

}

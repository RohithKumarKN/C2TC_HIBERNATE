package LogicalOperator;
import java.util.Scanner;
public class LogicalOperator {

	public LogicalOperator() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println((++a==6)||(--b==6));
System.out.println((a==5)&&(b==6));
System.out.println("B="+b);
System.out.println("A="+a);
System.out.println(!(a>b));
	}

}

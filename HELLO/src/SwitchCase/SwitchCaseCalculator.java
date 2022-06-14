package SwitchCase;
import java.util.Scanner;
public class SwitchCaseCalculator {

	public SwitchCaseCalculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
double a=sc.nextDouble();
System.out.println("Enter second number");
double b=sc.nextDouble();
System.out.println("Enter the operation to be performed");
sc.nextLine();
char operation=sc.nextLine().charAt(0);
double results=0;
switch (operation) {
case '+':
	results=a+b;
	break;
case '-':
	results=a-b;
	break;
case '*':
	results=a*b;
	break;
case '/':
	results=a/b;
	break;
	default :
		System.out.println("Invalid Operation");}
System.out.println("Result = "+results);
	}
	
}

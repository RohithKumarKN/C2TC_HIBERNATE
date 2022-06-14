package Loops;
import java.util.Scanner;
public class NestedLoopAlternativeSign {

	public NestedLoopAlternativeSign() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of N=");
double n=sc.nextDouble();
double result1=0;
double result2=0;
// for (double i=1;i<=n;i++){
//if (i%2==0) {
//result -=1/i; }
//else {
//result +=1/i;}
for (double i=1;i<=n;i+=2) {
	result1 =result1+1/i;
}
for(double i=2;i<=n;i+=2) {
	result2=result2-1/i;
}
System.out.println(result1 + result2);
	}

}

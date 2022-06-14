package Patterns;
import java.util.Scanner;
public class Pattern1 {

	public Pattern1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of N & M=");
int n=sc.nextInt();
int m=sc.nextInt();
for(int j=1;j<=m;j++) {
	for(int i=1;i<=n;i++) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}

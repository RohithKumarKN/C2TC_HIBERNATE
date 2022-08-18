package AssignmentOperator;
import java.util.Scanner;
public class AssignmentOperaratorAddition {

	public AssignmentOperaratorAddition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("A=");
int A=sc.nextInt();
System.out.println("N=");
int N=sc.nextInt();
A+=N;
A=++A;
System.out.println("A="+A);
	}

}

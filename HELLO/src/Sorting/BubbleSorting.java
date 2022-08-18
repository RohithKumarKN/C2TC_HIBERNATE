package Sorting;

import java.util.Scanner;

public class BubbleSorting {

	public BubbleSorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension");
		int rows = sc.nextInt();
		int[] a = new int[rows];
		System.out.println("Enter the array A");
		for (int i = 0; i < rows; i++) {

			a[i] = sc.nextInt();

		}
		int n = a.length;
		// if given is sorted
		// boolean sorted=true;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n-1  ; j++) {
				if (a[j + 1] < a[j]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					// sorted=false;
				}
			}
			// if (sorted)break;
		}
		for (int item : a) {
			System.out.print(item + "  ");
		}
	}

}

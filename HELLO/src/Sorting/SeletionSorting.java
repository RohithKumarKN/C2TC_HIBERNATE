package Sorting;

import java.util.Scanner;

public class SeletionSorting {

	public SeletionSorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension");
		int rows = sc.nextInt();
		int a[] = new int[rows];
		System.out.println("Enter the array");
		for (int i = 0; i < rows; i++) {
			a[i] = sc.nextInt();
		}
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int e : a) {
			System.out.println(e + "  ");
		}
	}

}

package lession_two;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String args[]) {
		
//		creating an array
		int arr[] = {2, 3, 5, 6, 7};
		
		//retrieving data from array (with index)
		System.out.println(arr[2]);
		
//		retrieving array with for loop
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		Array: taking input from user, Dynamic approach
		int size;
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int a1[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the " +i+ " element of the arrya: ");
			a1[i] = sc.nextInt();
		}
		
		//display array elements
		for(int j: a1) {
			System.out.println(j);
		}
		
		//Multi-dimensional  Array 
		int [][] b= new int[3][3]; //second dimension is optional
		Scanner sc1 = new Scanner(System.in);
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
			System.out.println("Enter the element of the arrya: ");
			b[r][c] = sc1.nextInt();
			}
		}
		
		//printing array elements
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
			System.out.print(b[r][c]+ " ");
		
			}
			System.out.println();
		}
		
	}

}

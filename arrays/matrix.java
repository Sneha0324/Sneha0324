package arrays;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of matrix1: ");
		int r1 = sc.nextInt();
		
		System.out.println("Enter the number of columns of matrix1: ");
		int c1 = sc.nextInt();
		
		System.out.println("Enter the number of rows of matrix2: ");
		int r2 = sc.nextInt();
		
		System.out.println("Enter the number of columns of matrix2: ");
		int c2 = sc.nextInt();
		
		int sum;
		
		if(r1==c2) {
			
			int mat1[][] = new int[r1][c1];
			int mat2[][] = new int[r2][c2];
			int res[][] = new int[r1][c2];
			
			System.out.println("Enter the elements of matrix 1: ");
			
			for(int i=0; i<r1; i++) {
				
				for(int j=0; j<c1; j++) {
					mat1[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter the elements of matrix 2: ");
			
			for(int i=0; i<r2; i++) {
				
				for(int j=0; j<c2; j++) {
					mat2[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Output: ");
			
			for(int i=0; i<r1; i++) {
				
				for(int j=0; j<c2; j++) {
					sum=0;
					
					for(int k=0; k<r2; k++) {
						sum += mat1[i][k]*mat2[k][j];
					}
					res[i][j]=sum;
					System.out.println(res[i][j]+"");
				}
				
				System.out.println();

			}
			
		} else {
			System.out.println("Multiplication is not possible.");
		}
	}
}

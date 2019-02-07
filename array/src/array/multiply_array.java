package array;
import java.io.*;
import java.util.Scanner;
public class multiply_array {
//Aim: This program will multiply two matrix
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		// First Matrix
		int m;// no of rows for the first matrix 
		int n;//  no of columns for first matrix
		m= scan.nextInt();
		n= scan.nextInt();
		int [][] a= new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]= scan.nextInt();
			}
		}
		
		// First matrix fin
		
		// Second Matrix
		int p;
		int q;
		p= scan.nextInt();// no of rows of first matrix
		q= scan.nextInt();// no of columns for second matrix
		int[][] b= new int[p][q];
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				b[i][j]=scan.nextInt();
			}
		}
		
		// Second matrix fin
		
		// Matrix multiplied
		if(p==n){
			int [][]ans= new int[m][q];
			for(int i=0;i<m;i++){
				for(int j=0;j<q;j++){
					
					int sum=0;
					
					for(int k=0;k<n;k++){
						
						sum= sum+a[i][k]*b[k][j];
					}
					ans[i][j]= sum;
				}
			}
			for(int i=0;i<m;i++){
				for(int j=0;j<q;j++){
					System.out.println(ans[i][j]);
				}
			}
			
			
			
			
		}
		
		
		
		
		
	}
}

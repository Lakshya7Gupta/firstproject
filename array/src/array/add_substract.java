package array;
import java.io.*;
import java.util.Scanner;
public class add_substract {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
// Aim: This program will add two array using user input
	int m;// no of rows
	int n;// no of columns
	m= scan.nextInt();
	n=scan.nextInt();
	// array created and declared
	int [][] x= new int[m][n];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			x[i][j]= scan.nextInt();
		}
	}
	// array 1 fin
	int p;
	int q;
	p= scan.nextInt();// no of rows 
	q= scan.nextInt();// no of columns
	// array created and declared
	int[][] y = new int[p][q];
	for(int i=0;i<p;i++){
		for(int j=0;j<q;j++){
			y[i][j]=scan.nextInt();
		}
	}
	// array 2 fin
	if(m*n==p*q){
		int [][] sum = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(x[i][j]+y[i][j]);
			}
		}
	}
	else{
		System.out.println("Addition of the folowing matrices is not possible");
	}
	// End of the experiment
	
	}
}

package array;
import java.io.*;
import java.util.Scanner;
public class Arrayq_8 {
	//Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
               int m;
               m= scan.nextInt();
		int [] a= new int [m];// Declare an array of size M
		
		for(int i=0;i<m;i++){
			a[i]=scan.nextInt();
		}
		
		int n;
		n= scan.nextInt();// Declare an array of size N
		int [] b= new int[n];
		
		for(int i=0;i<n;i++){
			b[i]=scan.nextInt();
		}
		
		
		
		
		int [] c= new int[m+n];//Declare a new array of size M+N
		
		for(int i=0;i<m+n;i++){
			for(int j=0;i<m;i++){
				c[j]=a[j];
			}
		for(int k=m;k<n;k++){
			c[i]=b[k];
		}
			System.out.println(c[i]);
			
			
			
			
			
			
		}
		
		
		
		
	}

}

package array;
import java.io.*;
import java.util.Scanner;
public class arrayq_6 {
// Aim : This program will rearrange the array such that the each element will be replaced by its next greatest element in the array(in the rightwards direction of the array.) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
		int size;
		size= scan.nextInt();
		
		int [] x = new int [size];
			for(int i=0;i<size;i++){	
				x[i]= scan.nextInt();
			}
		
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(x[j]-x[i]>0){
					
					 
					int temp = x[i];
					 x[i] = x[j];
					x[j]= temp;
					
				}
			}
		}
		
		for(int i=0;i<size;i++){
			System.out.println(x[i]);
		}
		
		
		
		
		
		
		
	}

}

package array;
import java.io.*;
import java.util.Scanner;
// Aim: This program will find the maximum element of a given array
public class arrayq_3 {
public static void main (String [] args){
	Scanner scan = new Scanner(System.in);
	int size;
	size= scan.nextInt();
	int [] x= new int[size];

	for(int i=0;i<size;i++){
		x[i]= scan.nextInt();
	}
	for(int i=0;i<size;i++){
		System.out.println(x[i]);
	}
	
	for(int i=0;i<size;i++){
		for(int j=0;i<size;i++){
			if(x[i]-x[j]>0){
				System.out.println("The largest element in the array is:" + x[i] );
			
			}
		}
	}
	
	
	
	
	
	
}
}

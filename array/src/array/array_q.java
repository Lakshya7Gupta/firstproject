package array;
import java.io.*;
import java.util.Scanner;
public class array_q {
//Aim: This program will return the rotated version of an array
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int size;// no of elemnts in the array
		size= scan.nextInt();
		// Array declared
		
		int [] x= new int[size];
		//Input taken from the user
		for(int i=0;i<size;i++){
			x[i]= scan.nextInt();
		}
		
		int [] result;
		for(int i=size-1;i>=0;i--){
			System.out.print(x[i]);
		}
		
		
	}
}

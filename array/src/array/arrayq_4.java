package array;
import java.io.*;
import java.util.Scanner;
public class arrayq_4 {
public static void main (){
	// Aim: This program will check weather the given sequence is an Arithmetic  Progression or not.
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
	for(int i=2;i<size;i++){
		Arrays.sort(x);
		int d=x[1]-x[0];
		int diff= x[i]-x[i-1];
		if(diff!=d){
			System.out.println("This is not an ap ");
		}
		if(diff== 2*d){
			System.out.println("This is an ap");
		}
		
		
		
		
	}
	
	
	
	
}
}

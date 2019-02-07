package array;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class arrayq_5 {
// Aim : This program will divide a rearrange a array such that all the even numbers are placed first and all the odd numbers are placed after them.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size;
		size= scan.nextInt();
		int [] x= new int [size] ;
		for(int i=0;i<size;i++){
			x[i]= scan.nextInt();
		}
		//for(int i=0;i<size;i++){
		//	System.out.println(x[i]);
	//	}
		 int left=0;
		 int right = x.length-1;
		 while(left<right){
			 while(x[left]%2==0 && left<right){
				 left++;
			 }
			 while(x[right]%2==1 && left<right){
				 right--;
			 }
			 // Create a swapping code
			 if(left<right){
				 int temp= x[left];
				 x[left]=x[right];
				 x[right]= temp;
				 left++;
				 right--;
			 }
			
			 
		 }
		
			System.out.println(Arrays.toString(x));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

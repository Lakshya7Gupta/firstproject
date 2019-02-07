package array;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class arrayq_7 {
// Aim : This program will separate a binary array into 0 and 1 and arrange 0 first then 1. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 int size;
		 size= scan.nextInt();
		 int [] x= new int [size];
		 for(int i=0;i<size;i++){
			 x[i]= scan.nextInt();
		 }
		int left=0;
		int right = x.length-1;
		
		while(left<right){
			while(x[left] ==0 && left<right){
				left++;
			}
			while(x[right] == 1 && left<right){
				right--;
			}
		
		if(left<right){
			int temp=x[left];
			x[left]= x[right];
			x[right]= temp;
			left++;
			right--;
			
		}
		}
		System.out.println(Arrays.toString(x));
		
	}

}

//    THIS PROGRAM IS STILL INCOMPLETE


package array;
import java.util.Scanner;
public class araayq_2 {
public static void main(String [] args){
	// Aim: This experiment will a rotate a given array around an element
	Scanner scan = new Scanner(System.in);
	int size;
	size= scan.nextInt();
	int [] x= new int[size];
	for(int i=0;i<=size-1;i++){
		x[i]= scan.nextInt();
		
	}
	for(int i=0;i<size;i++){
		System.out.print(x[i]);
	}
	int rotate;// THis is the index about which the rotation of the array will happen
	rotate=scan.nextInt();
	int [] a= new int [rotate];
	int [] b= new int [size-rotate-1];  
	
	for(int i=0;i<size;i++){
		if(i<rotate){
			a[i]= x[i];
		}
		
		else if (i>=rotate+1){
			b[i-rotate-1]= x[i];
		}
	}
	for(int i=0;i<=rotate-1;i++){
		System.out.print(a[i]);
	}
    for(int i=0;i<=size-rotate-2;i++){
    	System.out.print(b[i]);
    }
	
	
	
	
}
}

package array;
import java.io.*;
import java.util.Scanner;
public class create_add_substract {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
int [][] x= new int [2][3] ;// two dimensional array declared
for(int i= 0;i<2;i++){    // two dimensional array initialized
	for(int j=0;j<3;j++){
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		x[1][0]=4;
		x[1][1]=5;
		x[1][2]=6;
	}
}
// print the array
for(int i=0;i<2;i++){
	for(int j=0;j<3;j++){
		System.out.println(x[i][j]);
	}
}
System.out.println(x[0].length+x[1].length);// print the length of the string
// create an automatic array
int [][] y = new int[2][3];
for(int i=0;i<2;i++){
	for(int j=0;j<3;j++){
		y[i][j]= scan.nextInt();
	}
}

// print the array 
for(int i=0;i<2;i++){
	for(int j=0;j<3;j++){
		System.out.println(y[i][j]);
	}
}
	}

}
//# program complete

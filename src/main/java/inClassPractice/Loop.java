package inClassPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Loop {
	static int number = 4;

	public static void main(String[] args) {

//		printAllNnumber();
//      fibonacciForLoop(500);
//		whileVsDoWhile();
//		print1();
//		print2();
//		forEach();

		
	}
	
	public static void forEach() {
		int[] ary = {25,6,45,4,87,82};
		
		for(int i: ary) {
			System.out.println(i);
		}
//		
//		List <HashMap> alist = new ArrayList<HashMap>() ;
//
//		for( HashMap i    : alist) {
//			
//		}
		
 	}
	
	
	
	
	
	
	
	
	
	public static void print2() {
		
		int i =1;
		while(i<=5) {
			int a=1;
			while(a<=i) { 
//				System.out.print("*");
				System.out.println("Inner loop a: "+a+" i: "+i);
				a++;
				
			}
			System.out.println("*****Outer loop i: "+i);
			i++;
//			System.out.println();
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void print1() {
		//use while loop to print first image
//		int i=1;
//		while(i<=4) {
//			System.out.println("***********");
//			i++;
//		}
		
		int i=1;
		while(i<=4) {
			
			int a = 1;
			while(a<=10) {
				System.out.print("*");
				a++;
			}
			System.out.println("");
			
			i++;
		}	
}
	
	
	
	
	
	
	
	public static void whileVsDoWhile() {
		System.out.println("this is while VS do....while");
		int i = 1;
		while(i<3) {
			System.out.println("This is while loop");
		i++;
		}
		
		int a = 1;
		do {
			System.out.println("This is do - while loop");
		a++;
		}while(a<3);
		
	}
	
	
	
	
	
	
	
	public static void printAllNnumber() {
		//for loop
		for(int i=1 ;i<=400  ; i++) {
			System.out.println(i);
		}
		
		//while loop
		int i=1;
		while(i<=400) {
			System.out.println("while loop: "+i);
			i++;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void fibonacciWhileLoop(int maxNumber) {
		
		System.out.println("start with 0 1");
		int twoNumberBefore=0, oneNumberBefore=1;
		int currentNumber = twoNumberBefore+oneNumberBefore ;
		while( currentNumber<maxNumber) {

			System.out.println("current number is: "+currentNumber);  //currentNumber
		     twoNumberBefore = oneNumberBefore;
		     oneNumberBefore = currentNumber;
		     currentNumber=twoNumberBefore+oneNumberBefore;

		}
		
	}
	
	public static void fibonacciForLoop(int maxNumber) {
		
		System.out.println("start with 0 1");
		int twoNumberBefore=0, oneNumberBefore=1;
		for( int currentNumber = twoNumberBefore+oneNumberBefore ;currentNumber<maxNumber;  
				currentNumber=twoNumberBefore+oneNumberBefore) {

			System.out.println("current number is: "+currentNumber);  //currentNumber
		     twoNumberBefore = oneNumberBefore;
		     oneNumberBefore = currentNumber;

		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void if_else_switch() {
		// if number ==5, then print number
		// else print "number is invalid"

//		if (number >= 5) {
//			System.out.println(number);
//		} else {
//			System.out.println("number is invalid");
//		}
//
//		// switch
//		switch (number) {
//		case 5:
//			System.out.println(number);
//			break;
//		default:
//			System.out.println("number is invalid");
//		}
	}
}

//1) Write a program to divide, multiply, subtract and addition of two numbers - Day 3 assignment

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 3;
		  int num2 = 4; 
	 		 
		  System.out.println(num1 + " x " + num2 + " = " + 
		  (num1 * num2));
		   
		  System.out.println(num1 + " / " + num2 + " = " + 
		  (num1 / num2));
		  
		  System.out.println(num1 + " - " + num2 + " = " + 
		  (num1 - num2));
		  
		   System.out.println(num1 + " + " + num2 + " = " + 
		  (num1 + num2));
			   

	}

}


// 2) Write a program to check if a even number is palindrome or not - Day 3 Assignment

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		System.out.println("please insert a number"); // ask for user to type number
		  
		int reverse = 0; // set the reverse number
		Scanner sc = new Scanner(System.in);
		int userinput = sc.nextInt(); // the user input number to be checked for palindrome  
		int temp=userinput;  // store the user number into a temp variable
		  
		if (userinput % 2 == 0) { // check if the number is even
			
			while(temp > 0) { // check if number is bigger than 0
				int remainder=temp%10; // get remainder
				temp=temp/10; // get digits before remainder 
				reverse=(reverse*10)+remainder; // get reverse number
			} // end check if number is bigger than 0

 		   if(reverse==userinput)    { // check if reverse is same with userinput
 			   System.out.println(userinput + " is even and palindrome number ");  
 		   }
 		   
 		   else {   
 			  System.out.println(userinput + " is even and not a palindrome number ");  
 		   }
		             
		  } // end // check if the number is even
		    else { // check if the number is odd
		            System.out.println(userinput + " is odd"); 
		  }
			  
		 
		}  

}






//3) Write a program to find which numbers between 10 to 150 are divisible by 23 

public class Devisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10; i<=150; i++) {
			
			if ((i % 23) == 0) {
			    // number is divisible by 23
				  System.out.println(i + " is divisible by 23");
			}
			else {
			    //number is not divisible by 23
				  System.out.println(i + " is not divisible by 23");
			}
		}
		
	}

}

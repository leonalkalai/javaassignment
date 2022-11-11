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

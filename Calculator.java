/**
 * @(#)Calculator.java
 *
 *
 * @author 
 * @version 1.00 2025/8/29
 */

import java.util.Scanner;
public class Calculator {

   
    	public static void main(String args[]) {
	    	int a,b;
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter value of A: ");
		    	a=sc.nextInt();
		    	System.out.println("Enter value of B: ");
		    	b=sc.nextInt();
	    	System.out.println("Value of a: "+a+" and b: "+b);
	    	
	    	int op;
			System.out.println("select operation:-\n1.Add\t2.Sub.\t3.Multiply\t4.Divide\t5.Modulas ");
			op=sc.nextInt();
			switch(op)
			{
				case 1:{
					System.out.println("Addition: "+(a+b));
					break;
				}
				case 2:
				{
					System.out.println("Subtraction: "+(a-b));
					break;
				}
				case 3:
				{
					System.out.println("Multiplication: "+(a*b));
					break;
				}
				case 4:
				{
					System.out.println("division: "+(a/b));
				break;
				}
				
				case 5:
				{
					System.out.println("Modulas: "+(a%b));
				break;
				}
			}

    }
    
    
}
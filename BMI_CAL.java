/**
 * @(#)BMI_CAL.java
 *
 *
 * @author 
 * @version 1.00 2025/8/30
 */

import java.util.Scanner;
public class BMI_CAL {

   public static void main(String args[]) {
   float  height,weight;
   	Scanner sc=new Scanner(System.in);
   	//Enter  Height in Foot and Divide it by 3.281
   	System.out.println("Enter Your Height in Foot: ");
   	height=sc.nextFloat();
   	height=(height/3.281f);
   	
   	System.out.println("height: "+height);
   	
   	System.out.println("Enter your weight: ");
   	weight=sc.nextFloat();
   	
   	float BMI=(weight/(height*height));
   	System.out.println("Your BMI is: "+BMI);
   	
    	if(BMI <= 18.5)
   		{
   			System.out.println("You are Under-Weight");
   		}
   		else if(BMI <= 24.9)
   		{
   			System.out.println("Your weight is Normal");
   		}
   		else if(BMI <= 29.9)
   		{
   			System.out.println("You are OverWeight");
   		}
   		else
   		{
   			System.out.println("Invalid Command");
   		}
   	
   }
    
    
}
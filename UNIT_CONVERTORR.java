/**
 * @(#)UNIT_CONVERTORR.java
 *
 *
 * @author 
 * @version 1.00 2025/8/30
 */

import java.util.Scanner;
public class UNIT_CONVERTORR {

    
    	public static void main(String args[]) {
	    int a,b;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("ENter value to convert:-");
	    a=sc.nextInt();
	    System.out.println("SELECT:-\t1.KM to MILES\t2.CELCIUS to FEHRENHEIT");
	    b=sc.nextInt();
	    switch(b)
	    {
	    	case 1:
	    		{
	    			System.out.println(a/1.609);
	    				break;
	    		}
	    	case 2:
	    	{
	    		System.out.println((a * 9.0 / 5) + 32);
	    		break;
	    	}
	    }
	    
    }
    
    
}
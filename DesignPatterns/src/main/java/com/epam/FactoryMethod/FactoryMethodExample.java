package com.epam.FactoryMethod;
import java.io.*; 

public class FactoryMethodExample 
{
   
	      public static void main(String args[])throws IOException
	      {  
	      GetPlanFactory planFactory = new GetPlanFactory();  
	        
	      System.out.println("Choose a plan");
	      System.out.println("1. Domestic plan");
	      System.out.println("2. Commercial plan");
	      System.out.println("3. Institutional plan");
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      int planName=Integer.parseInt(br.readLine());  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      int units=Integer.parseInt(br.readLine());  
	  
	      Plan p = planFactory.getPlan(planName);  
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	      }  
}

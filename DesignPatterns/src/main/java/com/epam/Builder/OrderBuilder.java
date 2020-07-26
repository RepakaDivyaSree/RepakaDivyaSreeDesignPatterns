package com.epam.Builder;
import java.io.*;

public class OrderBuilder {

	public OrderedItems preparePizza() throws IOException{  
        
        OrderedItems itemsOrder=new OrderedItems();  
         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
          
        System.out.println(" Enter the choice of Pizza ");  
        System.out.println("============================");  
        System.out.println("        1. Veg-Pizza       ");  
        System.out.println("        2. Non-Veg Pizza   ");  
        System.out.println("        3. Exit            ");  
        System.out.println("============================");  
          
        int pizzaandcolddrinkchoice=Integer.parseInt(br.readLine());  
        switch(pizzaandcolddrinkchoice)  
        {  
           case 1:{  
                       
                     System.out.println("You ordered Veg Pizza");  
                     System.out.println("\n\n");  
                     System.out.println(" Enter the types of Veg-Pizza ");  
                     System.out.println("------------------------------");  
                     System.out.println("        1.Cheeze Pizza        ");  
                     System.out.println("        2.Onion Pizza        ");   
                     System.out.println("        3.Exit            ");  
                     System.out.println("------------------------------");  
                                  int vegpizzachoice=Integer.parseInt(br.readLine());  
                     switch(vegpizzachoice)  
                     {  
                          case 1:  
                                {  
                                    System.out.println("You ordered Cheeze Pizza");  
                                      
                                    System.out.println("Enter the cheeze pizza size");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Cheeze Pizza ");  
                                    System.out.println("    2. Large Cheeze Pizza ");  
                                    System.out.println("------------------------------------");  
                                    int cheezepizzasize=Integer.parseInt(br.readLine());  
                                    switch(cheezepizzasize)  
                                        {  
                                              case 1:  
                                                   itemsOrder.addItems(new SmallCheezePizza());  
                                                   break;  
                                             case 2:  
                                                   itemsOrder.addItems(new LargeCheezePizza());  
                                                   break;
                                        }
                                    break;
                                }
                          case 2:  
                                {  
                                    System.out.println("You ordered Onion Pizza");  
                                    System.out.println("Enter the Onion pizza size");  
                                    System.out.println("----------------------------------");  
                                    System.out.println("    1. Small Onion Pizza ");
                                    System.out.println("    2. Large Onion Pizza ");  
                                    System.out.println("----------------------------------");  
                                    int onionpizzasize=Integer.parseInt(br.readLine());  
                                    switch(onionpizzasize)  
                                              {  
                                                  case 1:  
                                                   itemsOrder.addItems(new SmallOnionPizza());  
                                                   break;  
                                                      
                                                  case 2:  
                                                   itemsOrder.addItems(new LargeOnionPizza());  
                                                   break;     
                                                        
                                              }       
                                   } 
                                break;   
                           
                     }      
                  
                   }  
                   break;// Veg- pizza choice completed.  
                  
            case 2:  
                   {  
                       System.out.println("You ordered Non-Veg Pizza");  
                       System.out.println("\n\n");  
                         
                                    System.out.println("Enter the Non-Veg pizza size");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Non-Veg  Pizza ");  
                                    System.out.println("    2. Large Non-Veg  Pizza ");  
                                    System.out.println("------------------------------------");  
                                      
                         
                       int nonvegpizzasize=Integer.parseInt(br.readLine());   
                        
                        switch(nonvegpizzasize)  
                             {  
                                 
                                  case 1:  
                                      itemsOrder.addItems(new SmallNonVegPizza());  
                                      break;  
                                                      
                                  case 2:  
                                      itemsOrder.addItems(new LargeNonVegPizza());  
                                      break;       
                              }  
                                      
                       }    
                        break;  
            default:  
            {  
                  break;  
                  
            } 
        }
		return itemsOrder;
  
	}
}

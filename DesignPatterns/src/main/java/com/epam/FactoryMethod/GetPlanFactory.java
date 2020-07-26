package com.epam.FactoryMethod;

class  DomesticPlan extends Plan{  
    //@override  
     public void getRate(){  
         rate=3.50;              
    }  
}

class  CommercialPlan extends Plan{  
	   //@override   
	    public void getRate(){   
	        rate=7.50; 
	    }
}

class  InstitutionalPlan extends Plan{  
	   //@override  
	    public void getRate(){   
	        rate=5.50;  
	   }
}
public class GetPlanFactory {

	public Plan getPlan(int planType){   
      if(planType == 1) {  
             return new DomesticPlan();  
           }   
       else if(planType == 2){  
            return new CommercialPlan();  
        }   
      else if(planType == 3) {  
            return new InstitutionalPlan();  
      }  
  return null;  
}  
}

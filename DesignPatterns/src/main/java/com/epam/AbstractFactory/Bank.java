package com.epam.AbstractFactory;

interface Bank {
	String getBankName();
}

class SBI implements Bank{  
    private final String BNAME;  
    public SBI(){  
              BNAME="SBI BANK";  
      }  
     public String getBankName(){  
                return BNAME;  
     }  
} 

class HDFC implements Bank{  
    private final String BNAME;  
    public HDFC(){  
           BNAME="HDFC BANK";  
   }  
   public String getBankName() {  
             return BNAME;  
   }  
} 

class ICICI implements Bank{  
    private final String BNAME;  
    ICICI(){  
             BNAME="ICICI BANK";  
     }  
     public String getBankName() {  
               return BNAME;  
    }  
}

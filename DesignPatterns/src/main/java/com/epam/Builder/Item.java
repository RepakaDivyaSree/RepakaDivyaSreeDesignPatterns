package com.epam.Builder;

public interface Item {

	 public String name();  
	    public String size();  
	    public float price();
}

abstract class Pizza implements Item{  
    @Override  
    public abstract float price();  
}

abstract class VegPizza extends Pizza{  
    @Override  
    public abstract float price();  
    @Override  
    public abstract  String name();  
    @Override  
    public abstract  String size();  
}

abstract class NonVegPizza extends Pizza{  
    @Override  
    public abstract float price();  
    @Override  
    public abstract String name();  
    @Override  
    public abstract String size();  
}

class SmallCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 170.0f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
       return "Small size";  
    }    
}

class LargeCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 260.0f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
}

class SmallOnionPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 120.0f;  
    }  
    @Override  
    public String name() {  
        return  "Onion Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Small Size";  
    }    
}

class LargeOnionPizza extends  VegPizza{  
    @Override  
    public float price() {  
        return 180.0f;  
    }  
    @Override  
    public String name() {  
         return "Onion Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Large size";  
    }  
}

class SmallNonVegPizza extends NonVegPizza {  
	  
    @Override  
    public float price() {  
        return 180.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Samll Size";  
    }  
      
}

class LargeNonVegPizza extends NonVegPizza{  
    
    @Override  
    public float price() {  
        return 220.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
      
}
package com.epam.Singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Singleton {

	private static Singleton obj; 
	  
    private Singleton() {} 
    public static Singleton getInstance() 
    { 
        if (obj==null) 
            obj = new Singleton(); 
        return obj; 
    } 
   
    }

class SingletonExample
{
	private static final Logger LOGGER=LogManager.getLogger(Singleton.class);
	public static void main( String[] args )
	{
		Singleton s= Singleton.getInstance();
		Singleton s1= Singleton.getInstance();
	 LOGGER.debug(s1);
	LOGGER.info(s1);
	}
}

package practice2;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
  
	
	public void drive() 
	{
		System.out.println("Bike is going...");
	}
}

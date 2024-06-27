package practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tyre {

   public String brand;
    @Autowired
	private Car c;

	public Car getC() {
	return c;
}

public void setC(Car c) {
	this.c = c;
}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
    public void d() {
    	c.drive();
    }
	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
		
	}
	
}

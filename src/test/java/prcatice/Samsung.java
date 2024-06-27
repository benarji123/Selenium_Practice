package prcatice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("m")
    MobileProcesessor p;
	
	public void config() {
		System.out.println("Samsung s7");
		p.procesessor();
	}
	 
}

package prcatice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SanpDragon  implements MobileProcesessor{

	@Override
	public void procesessor() {
		// TODO Auto-generated method stub
		System.out.println("Words Best Processor");
	}
 
}

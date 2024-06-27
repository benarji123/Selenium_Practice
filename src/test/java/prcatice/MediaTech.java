package prcatice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="m")
public class MediaTech implements MobileProcesessor {

	@Override
	public void procesessor() {
		System.out.println("Word second best processor");
		
	}

}

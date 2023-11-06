package in.ineuron.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWishMessage() {
		
		LocalDateTime dateTime = LocalDateTime.now();
		int hours=dateTime.getHour();
		
		if(hours<12)
			return "Good Morning";
		else if(hours<16)
			return "Good Afternoo";
		else if(hours<20)
			return "Good Evening";
		else
			return "Good Night";
	}

	
}

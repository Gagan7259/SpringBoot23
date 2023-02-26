package EntityListner;

import java.util.UUID;

import org.springframework.context.ApplicationListener;

import Entity.User;
import Event.RegistrationCompleteEvent;

public class registrationCompleteEventLIstner implements ApplicationListener<RegistrationCompleteEvent> {

	@Override
	public void onApplicationEvent(RegistrationCompleteEvent event) {

		// Create verification token for the user
		User user = event.getUser();
		String token = UUID.randomUUID().toString();
		
		// Send mail to user

	}

}

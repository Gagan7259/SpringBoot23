package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.User;
import Event.RegistrationCompleteEvent;
import Model.UserModel;
import Service.UserService;

@RestController
public class RegistrationController {
	@Autowired
	private UserService userserv;
	@Autowired
	private ApplicationEventPublisher publisher;

	@PostMapping("/rigister")
	public String registerUser(@RequestBody UserModel usermodel) {
		User user = userserv.registerUser(usermodel);
		publisher.publishEvent(new RegistrationCompleteEvent(
				user,"url"));
		
		
		return "Succes";
	}
}

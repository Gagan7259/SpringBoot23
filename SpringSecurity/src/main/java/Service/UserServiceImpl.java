package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Entity.User;
import Model.UserModel;
import Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User registerUser(UserModel usermodel) {
		User user = new User();
		user.setEmail(usermodel.getEmail());
		user.setFirst_name(usermodel.getFirst_name());
		user.setLast_name(usermodel.getLast_name());
		user.setRole("User");
		user.setPassword(passwordEncoder.encode(usermodel.getPassword()));

		userRepo.save(user);
		return user;
	}

}

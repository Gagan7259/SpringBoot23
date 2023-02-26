package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class websecurityconfig {
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder(11);

	}
}

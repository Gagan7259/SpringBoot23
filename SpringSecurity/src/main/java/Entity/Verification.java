package Entity;

import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Verification {
	// Experiation time 10Minuts
	private static final int EXPERIRATION_TIME = 10;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String token;

	private int ExpirationTime;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "User_id", nullable = false, foreignKey = @ForeignKey(name = "FK_USER_VERIFY_TOKEN"))
	private User user;

	public Verification(User user, String token) {
		super();
		this.token = token;
		this.user = user;
		this.ExpirationTime = calculateExpirationDate(EXPERIRATION_TIME);
	}

	public Verification(String token) {
		super();
		this.token = token;
		this.ExpirationTime = calculateExpirationDate(EXPERIRATION_TIME);
	}

	private int calculateExpirationDate(int experirationTime) {
		Calendar calender = Calendar.getInstance();
		calender.setTimeInMillis(new Date().getTime());
		calender.add(Calendar.MINUTE , ExpirationTime);
		return new Date(calender.getTime().getTime());

	}

}

package enumHandling;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DstvUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	@Enumerated(EnumType.STRING)
	private UserStatus userStatus;
	
	public DstvUsers() {
		
	}

	public DstvUsers(int id, String userName, UserStatus userStatus) {
		this.id = id;
		this.userName = userName;
		this.userStatus = userStatus;
	}

	public int getId() {
		return id;
	}

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "DstvUsers [id=" + id + ", userName=" + userName + ", userStatus=" + userStatus + "]";
	}
	
	

}

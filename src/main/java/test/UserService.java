package test;

public class UserService {
	private String message;
	public void sayHi() {
		System.out.println("User");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

package test;

public class PersonService {
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;
	public void sayHi() {
		System.out.println("Person");
	}
	public String getMessage() {
		return message;
	}
}

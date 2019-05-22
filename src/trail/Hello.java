package trail;

public class Hello {

	private String message = "Sri Ram Ede";

	public void initmethod() {
		System.out.println("I am inititalized");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void endmeth() {
		System.out.println("end emthod before destruction");
	}

}

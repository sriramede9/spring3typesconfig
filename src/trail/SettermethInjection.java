package trail;

public class SettermethInjection {

	private String style;
	private String color;

	public SettermethInjection() {
		// TODO Auto-generated constructor stub
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAB(int a, int b) {

		System.out.println(a + "" + b);

	}
	
	private Hello hllo;

	public Hello getHllo() {
		return hllo;
	}

	public void setHllo(Hello hllo) {
		this.hllo = hllo;
	}
	
	
}

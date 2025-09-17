package worldcup;

/**
 * Class to define the coach
 */
public class Coach extends Person {
	String style;

	public Coach(int age){
		super(age);
	}

	public void train() {
		System.out.println("train");
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

}

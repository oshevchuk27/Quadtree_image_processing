package quadtree;
/**
 * A class that stores pixels
 * color components.
 *
 * @author Olga Shevchuk
 *
 */
public class Color {

	private int red;
	private int blue;
	private int green;


	public Color(int red, int blue, int green) {
		this.red = red;
		this.blue = blue;
		this.green = green;
	}

	public int getRed() {
		return this.red;
	}

	public int getBlue() {
		return this.blue;
	}

	public int getGreen() {
		return this.green;
	}




}

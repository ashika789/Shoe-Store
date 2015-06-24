public class Shoe {

	public String style, color;
	public double size; 

	public Shoe() {
		style = "";
		color = "";
		size = 0.0;

	}
	public Shoe(String style, String color, double size) {
		this.style = style;
		this.color = color;
		this.size = size;
	}

	public String getStyle() {
		return style;
	}

	public String getColor() {
		return color;
	}

	public double getSize() {
		return size;
	}


	public void changeStyle(String newStyle) {
		style = newStyle;
	}

	public void changeColor(String newColor) {
		color = newColor;
	}

	public void changeSize(double newSize) {
		size = newSize;
	}

}
public class ShoeApplication {

	public static void main(String[] args) {
		Shoe nerdShoes = new Shoe();
		Shoe coolShoes = new Shoe("Sandals", "Brown", 8.5);

		nerdShoes.changeColor("Tan");
		nerdShoes.changeStyle("Walking");
		nerdShoes.changeSize(9.5);

		System.out.println("nerdShoes: ");
		//System.out.println("The color is: " + nerdShoes.getColor());
		System.out.println("The style is: " + nerdShoes.getStyle());
		//System.out.println("The size is: " + nerdShoes.getSize());

		coolShoes.changeColor("Purple");
		System.out.println("coolShoes: ");
		//System.out.println("The color is: " + coolShoes.getColor());
		System.out.println("The style is: " + coolShoes.getStyle());
		//System.out.println("The size is: " + coolShoes.getSize());


	}

}
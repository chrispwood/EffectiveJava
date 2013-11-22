public enum IceCreamTwist {
	VANILLA("white"),
	STRAWBERRY("pink"),
	WALNUT("brown"),
	CHOCOLATE ("dark brown");

	String color;

	IceCreamTwist(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println(VANILLA);
		System.out.println(CHOCOLATE);
	}

}
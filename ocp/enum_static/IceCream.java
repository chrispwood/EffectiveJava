enum IceCream {
	VANILLA("white"),
	STRAWBERRY("pink"),
	WALNUT("brown") {
		public String toString() {
			return "WALNUT is Brown in color"+flavor();
		}
		public String flavor() {
			return "great!";
		}
	},
	CHOCOLATE ("dark brown");

	private String color;
	IceCream(String color) {
		this.color = color;
	}

	public String toString() {
		return "MyColor:" + color;
	}

	public static void main(String args[]) {
		System.out.println(WALNUT);
		// System.out.println(WALNUT.flavor());
	}
}
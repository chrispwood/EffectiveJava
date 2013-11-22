enum Level {
	BEGINNNER,
	INTERMEDIATE,
	EXPERT;

	static { System.out.println("static init block"); }

	Level() {
		System.out.println("constructor");
	}

	public static void main(String args[]) {
		System.out.println(Level.BEGINNNER);
	}
}
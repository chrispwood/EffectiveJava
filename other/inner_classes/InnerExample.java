class Outer {
	void aMethod() {
		class Inner {
			final static String name = "compiles";
			final static int counter = 10;
			final static Integer outer = Integer.valueOf(3); // does not compile
			final static Object objConst = new Object(); // does not compile
		}

		Inner inner = new Inner();
	}

	public static void main(String args[]) {
    Outer outer = new Outer();
    outer.aMethod();
  }
}

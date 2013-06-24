
public class InnerClassConstructors {
	static class Inner {
		private Inner() {}
		//public Inner() {}

	}

	static Inner getInstance() {
		return new Inner();
	}

	public static void main(String args[]) {
		InnerClassConstructors.Inner i = new InnerClassConstructors.Inner();
	}
}
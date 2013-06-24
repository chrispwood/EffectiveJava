
public class NestedInnerStatic {
	public static int loopCount = 0;

	public NestedInnerStatic() {
	}

	public void doThings() {
		class NestedInner {
			public String thing = "happy";

			// not allowed! Cannot define static members in a method local class
			// public static String thing2 = "statically happy";

			// static {
				// thing = "happy";
			// }

			// allowed
			protected NestedInner() {
			}

			// not allowed
			// private NestedInner() {}

			// these are allowed!
			/*
			NestedInner inner = new NestedInner();
			NestedInnerStatic outer = new NestedInnerStatic();
			*/

			// Infinite loop:
			public void doStackOverflowThings() {
				loopCount++;
				System.out.println("looping..."+loopCount);
				NestedInnerStatic tmp = new NestedInnerStatic();
				tmp.doThings();
			}

			public String doFiniteThings() {
				return thing;
			}

		}

		NestedInner inner = new NestedInner();
		inner.doStackOverflowThings();

		System.out.println(new NestedInner().doFiniteThings());
	}

	public static void main(String args[]) {
		new NestedInnerStatic().doThings();
	}
}

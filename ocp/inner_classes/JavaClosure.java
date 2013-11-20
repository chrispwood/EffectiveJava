
public class JavaClosure {

	private final String cool;
	private final String stuff;

	public JavaClosure(String cool, String stuff) {
		this.cool = cool;
		this.stuff = stuff;
	}

	private String getCoolStuff() {
		return cool + ":" + stuff;
	}

	public class Inner {
		public String getCool() { return cool; }
		public String getCount() { return stuff; }
		public String getCoolStuff() { return JavaClosure.this.getCoolStuff(); }
	}

	public static void main(String args[]) {
		JavaClosure.Inner i = new JavaClosure("whoa","closure?").new Inner();
		System.out.println(i.getCool());
		System.out.println(i.getCount());
		System.out.println(i.getCoolStuff());

	}
}
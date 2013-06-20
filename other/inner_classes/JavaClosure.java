
public class JavaClosure {

	private final String cool;
	private String stuff;

	public JavaClosure(String cool, String stuff) {
		this.cool = cool;
		this.stuff = stuff;
	}

	private String getCoolStuff() {
		return cool + ":" + stuff;
	}

	public void changeStuff() {
		stuff = "standard boring";
	}

	public class Inner {
		public String getCool() { return cool; }
		public String getCount() { return stuff; }
		public String getCoolStuff() { return JavaClosure.this.getCoolStuff(); }
	}

	public static void main(String args[]) {
		JavaClosure o = new JavaClosure("whoa","closure?");
		JavaClosure.Inner i = o.new Inner();
		System.out.println(i.getCool());
		System.out.println(i.getCount());
		System.out.println(i.getCoolStuff());

		o.changeStuff();
		System.out.println(i.getCool());
		System.out.println(i.getCount());
		System.out.println(i.getCoolStuff());

	}
}
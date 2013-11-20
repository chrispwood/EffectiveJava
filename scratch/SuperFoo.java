import java.util.Date;

public class SuperFoo extends Foo {
	public Object utils;
	public Date overriddenDate;
	
	public SuperFoo(Date dt) {
		super(dt);
		utils = new Object();
	}
	
	@Override
	public void setDate(Date dt) {
		this.overriddenDate = dt;
		utils.incrementSetCount();
	}
}
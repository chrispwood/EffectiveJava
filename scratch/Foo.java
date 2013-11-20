import java.util.Date;

public class Foo {
	private Date dt;
	
	public Foo(Date dt) {
		setDate(dt);
	}
	
	public void setDate(Date dt) { 
		this.dt = dt;
	}
	
	public Date getDate() {
		return this.dt;
	}
	
}
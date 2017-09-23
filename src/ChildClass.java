
public class ChildClass extends ParentClass {

	int x;
	
	public ChildClass() {
		this(1);
		System.out.println("Inside method A");
	}
	
	public ChildClass(int x) {
		super(x);
		this.x = x;
		System.out.println("Inside method B");
	}


	
}

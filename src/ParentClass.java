
public class ParentClass {
	
	int x;
	
	public ParentClass() {
		System.out.println("Inside method D");
	}
	
	public ParentClass(int x) {
		this();
		this.x = x;
		System.out.println("Inside method C");
	}

}

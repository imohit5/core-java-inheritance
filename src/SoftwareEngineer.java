
public class SoftwareEngineer extends Employee {

	int salary;

	public SoftwareEngineer() {

	}
	
	SoftwareEngineer(int id, String name, int salary) {
		super(id,name);
		this.salary = salary;
	}

	@Override
	void test1() {
		super.test1();
		System.out.println("Inside SoftwareEngineer");
	}
	
	void display() {
		System.out.println("Software Engineer id:"+super.id);
		System.out.println("Software Engineer name:"+super.name);
		System.out.println("Software Engineer salary:"+this.salary);
	}
}

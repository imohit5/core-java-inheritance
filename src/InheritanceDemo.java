//this is single inheritance,  java.lang.Object
public class InheritanceDemo {

	private void test1A() {
		System.out.println("inside test1A()");
	}
	
	public static void main(String[] args) {
		InheritanceDemo obja = new InheritanceDemo();
		obja.test1A();
		obja.getClass();
		System.out.println(obja.getClass());
		System.out.println(obja.hashCode());
	}
	
}

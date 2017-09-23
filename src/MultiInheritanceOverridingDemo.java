//this is single inheritance,  java.lang.Object
public class MultiInheritanceOverridingDemo {
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		System.out.println(lion.move());
		
		Eagle eagle = new Eagle();
		System.out.println(eagle.move());
		
		Fish fish = new Fish();
		System.out.println(fish.move());
		
	}
	
}

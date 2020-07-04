package Runtime;

public class C extends B{

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println("=========");
		A ab = new B();
		
		System.out.println("------"); 
		//B ba = (B) new A();
	}
}

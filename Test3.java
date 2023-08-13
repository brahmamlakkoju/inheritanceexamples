package inheritanceexamples;
class Abcd{
	void greet(){
		System.out.println("Hello Every One");
	}
}
class Bacd extends Abcd{
	void greet(){
		super.greet();
		System.out.println("Welcome Every One");
	}
}

public class Test3 {

	public static void main(String[] args) {
		Bacd ob=new Bacd();
		ob.greet();
	}

}

package inheritanceexamples;
class Abc{
	void greet(){
		System.out.println("Hello Every One");
	}
}
class Bac extends Abc{
	void greet(){
		System.out.println("Welcome Every One");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Bac ob=new Bac();
		ob.greet();
	}

}

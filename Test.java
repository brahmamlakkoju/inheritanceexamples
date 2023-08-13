package inheritanceexamples;
class A{
	A(){
		System.out.println("parent class costructor");
	}
}
class B extends A{
	B(){
		System.out.println("child class constructor");
	}
}

public class Test {

	public static void main(String[] args) {
		B ob=new B();
	}

}

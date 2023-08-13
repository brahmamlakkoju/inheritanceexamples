package inheritanceexamples;
class Abcde{
	int a=10,b=20;
	}
class Bacde extends Abcde{
	int a=1000,b=2000;
	void sum(int a, int b) {
	    System.out.println(a+b);
		System.out.println(super.a+ super.b);
		System.out.println(this.a+this.b);
	}
}

public class Test4 {

	public static void main(String[] args) {
		Bacde ob=new Bacde();
		ob.sum(100,200);
	}

}

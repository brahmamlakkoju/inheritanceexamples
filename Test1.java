package inheritanceexamples;
class Ab{
	Ab(int a){
		System.out.println("parent class parameterized costructor");
	}
}
class Ba extends Ab{
	Ba(){
		super(100);
		System.out.println("child class constructor");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Ba ob=new Ba();
	}

}

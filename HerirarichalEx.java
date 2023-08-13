class Shape{
	double l=2.5;
	double b=3.5;
	double h=5.6;
}
class Rectangle extends Shape{
	void area() {
		System.out.println("Area of Rectangle"+l*b);
	}
}
class Traingle extends Shape{
	void area() {
		System.out.println("Area of Traingle"+0.5*b*h);
	}
}
public class HerirarichalEx {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();
		Traingle t=new Traingle();
		t.area();
	}

}

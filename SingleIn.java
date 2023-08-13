class Person{
	int age;
	String name;
}
class Student extends Person{
	public void readStudent(int a,String n) {
		age=a;
		name=n;
	}
	public String showStudent() {
		return name+"  "+age;
	}
}
public class SingleIn {
	public static void main(String[] args) {
		Student s=new Student();
		s.readStudent(18, "brahmam");
		System.out.println(s.showStudent());
	}

}

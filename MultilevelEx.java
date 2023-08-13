class Student1{
	String name;
	int rno;
	void readStudent(String n,int r) {
		name=n;
		rno=r;
	}
	void printStudent() {
		System.out.println("Name:   "+name);
		System.out.println("R.No:   "+rno);
	}
}
class StudentMarks extends Student1{
	int marks1,marks2,marks3;
	void readMarks(int m1,int m2,int m3) {
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	int totalMarks() {
		return marks1+marks2+marks3;
	}
	
}
class StudentMemo extends StudentMarks{
	void certificate() {
		printStudent();
		System.out.println("Marks:"+totalMarks());
	}
}
public class MultilevelEx {
	public static void main(String[] args) {
		StudentMemo sm=new StudentMemo();
		sm.readStudent("brahmam", 1);
		sm.readMarks(90, 95, 100);
		sm.certificate();
		
	}

}

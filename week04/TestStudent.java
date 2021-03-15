package project;

public class TestStudent {

	public static void main(String[] args) {
		StudentData.SetCollege("Econmics");
		
		StudentData student1 = new StudentData("Tamer", 123456,30);
		//student1.SetCollege("Computing");
		
		StudentData student2 = new StudentData("Kim YoungJae", 452457,22);
		//student2.SetCollege("Physics");
		
		// 참조자 자체를 출력하려고 할 때 toString() 메소드가 없다면 주소 값을, 있다면 toString의 결괏값을 출력한다.
		System.out.println(student1);
		System.out.println(student2);
		//System.out.println(student1.getStudentID());
		//System.out.println(student1.getStudentAge());

	}

}

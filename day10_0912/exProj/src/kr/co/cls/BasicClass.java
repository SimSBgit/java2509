package kr.co.cls;

public class BasicClass {

	public BasicClass() {
		Student st1 = new Student("김철수", 20, "20250715");
		Student st2 = new Student("이영희", "20250716");
//		
//		st1.name = "김철수";
//		st1.age = 20;
//		st1.studentId = "20250715";
		st1.setName("김갑수");
		st1.setStudentId("20201010");
		String myName = st1.getName();
		System.out.println(myName);
//		
//		st2.name = "이영희";
//		st2.age = 24;
//		st2.studentId = "20250716";
		
		st1.introduce();
		st1.study();
		System.out.println(st1.toString());
		st2.introduce();
		st2.study();
		System.out.println(st2.toString());
	}
}

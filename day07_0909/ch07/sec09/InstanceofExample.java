package ch07.sec09;

public class InstanceofExample {

	public static void personInfo(Person person) {

		System.out.println("name : " + person.name);
		person.walk();

		if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		} 
		//위 코드는 구식 코드, 아래 방식이 오류도 적고 간결하고 모든 면에서 나음.

		if (person instanceof Student student) {
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);

		System.out.println();

		Person p2 = new Student("김길동", 10);
		personInfo(p2);

	}
}

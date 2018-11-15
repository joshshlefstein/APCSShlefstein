
public class TestPerson {

	public static void main(String[] args) {
		Person defaultPerson = new Person();
		String fn = defaultPerson.firstName;
		String ln = defaultPerson.lastName;
		System.out.println(fn + " " + ln);

		Person evan = new Person("Evan", "Spector", 17);
		System.out.println(evan.firstName + " " + evan.lastName + " " + evan.age);
		// evan.increaseAge(10);
		System.out.println("Evan's age is: " + evan.increaseAge(10));

		Student noa = new Student("Noa", "Rogoszinski", 17);
		System.out.println(noa.firstName + " " + noa.lastName + " " + noa.age + " " + noa.id + " " + noa.gpa);

		Student josh = new Student("Josh", "Leeman", 17, 12345, 6.0);
		System.out.println(josh.firstName + " " + josh.lastName + " " + josh.age + " " + josh.id + " " + josh.gpa);

	}

}

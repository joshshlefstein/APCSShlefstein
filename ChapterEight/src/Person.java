
public class Person {
	// attributes
	String firstName;
	String lastName;
	int age;

	// constructor
	public Person() {
		firstName = "John";
		lastName = "Doe";
		age = 39;
	}

	// second constructor where I can create a person with first, last and age
	public Person(String fn, String ln, int a) {
		firstName = fn;
		lastName = ln;
		age = a;
	}

	// methods
	public int increaseAge(int incAmnt) {
		age = age + incAmnt;
		return age;
	}
}


public class Student extends Person {// means I'm a person object that will inherit
	// all the properties of a person in addition to the ones in this class

	int id;
	double gpa;

	public Student(String first, String last, int age) {// constructor
		super(first, last, age);// pass the information into the person class
		id = 00000;// stored within student class
		gpa = 0.0;// stored within student class
	}

	public Student(String first, String last, int age, int i, double g) {
		super(first, last, age);
		id = i;
		gpa = g;
	}

}

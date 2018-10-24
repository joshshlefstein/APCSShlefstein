// Java1219.java
// All the previous static arrays examples showed the use of a static
// array to stored primitive, simple data type values.
// This program example demonstrates that a static array can store
// object values as well.  In this case a static array is constructed,
// which stores <Student> objects.


import java.util.Scanner;

public class Java1219
{

	public static void main(String args[])
	{
		System.out.println("\nJava1219.java\n");

		Scanner stringInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		System.out.print("Enter the number of students  ==> ");
		int numStudents = intInput.nextInt();

		Student students[] = new Student[numStudents];
		for (int index = 0; index < numStudents; index++)
		{
			System.out.print("Enter student's name  ==> ");
			String name = stringInput.nextLine();
			System.out.print("Enter student's age  ==> ");
			int age = intInput.nextInt();
			students[index] = new Student(name,age);
		}

		System.out.println("\n\n");
		for (int index = 0; index < numStudents; index++)
		{
			students[index].showData();
		}
	}

}


class Student
{
	private String name;
	private int age;

	public Student(String n, int a)
	{
		name = n;
		age = a;
	}

	public void showData()
	{
		System.out.println("Name: " + name);
		System.out.println("Age:  " + age);
		System.out.println();
	}
}



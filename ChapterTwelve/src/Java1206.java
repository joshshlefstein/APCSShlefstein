// Java1206.java
// This program demonstrates a <char> array and a <String> array.
// Both arrays use an initializer list.


public class Java1206
{
	public static void main(String args[])
	{
		System.out.println("Java1206\n");

		char list1[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for (int k = 0; k < 26; k++)
			System.out.print(list1[k]);
		System.out.println("\n");

		String list2[] = {"John","Greg","Maria","Heidi","Diana","David"};
		for (int k = 0; k < 6; k++)
			System.out.println(list2[k]);
		System.out.println();
	}
}


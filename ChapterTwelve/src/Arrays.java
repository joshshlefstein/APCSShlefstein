
public class Arrays {

	public static void main(String[] args) {
		int[] numArray= {1,2,3,4,5,6,7,8,9}; //data structure with 9 numbers inside the array
		
		System.out.println(does6Exist(numArray));
		
		reverse(numArray);
		for(int i=0; i<numArray.length; i++)
		System.out.println(numArray[i]);
		
		
		System.out.println("\n"+ average(numArray));
		
		
		reverse(numArray);
		System.out.println(findIndex(numArray, 2));
		
	}


	public static boolean does6Exist(int[] testArray) {
		boolean exists=false;
		
		for(int x=0; x<testArray.length; x++) {
			System.out.println(testArray[x]);
			if(testArray[x]==6) {
				exists= true;
						
			}
		}
	return exists;
	}
//	write a method that reverses the items in the array
	public static int[] reverse(int[] array) {
		int temp=0;
		
		for(int i=0; i<array.length/2; i++) {
			temp= array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
			
			
		}
		return array;
	}
	//calculate the average value of array elements
	public static int average(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum=sum+array[i];
		}
		return (sum/array.length);
	}
	
	//test if an array contains a specific value
	public static boolean does5Exist(int[] array) {
		boolean exists=false;
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
			if(array[i]==5) {
				exists= true;
						
			}
		}
		return exists;
	}
	//find the index of an array element
	public static int findIndex(int[] array, int t) {
		if(array==null) return-1;
		int length=array.length;
		int i = 0;
		while (i<length) {
			if (array[i]==t) return i;
			else i=i+1;
		}
		return -1;
	}
	
	//challenge: remove a specific element from an array and return the new array without the value
	}
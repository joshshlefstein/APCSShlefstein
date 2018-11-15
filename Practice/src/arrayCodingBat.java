
public class arrayCodingBat {

	public static void main(String[] args) {

		printArray(fizzBuzz(1,6));

	}
	public static String[] fizzBuzz(int start, int end) {
		int size=end-1;
		String[] array=new String[size];
		for(int k=start; k<end-1; k++) {
			if((k+1)%3==0 && (k+1)%5==0){
				array[k]="FizzBuzz";
			}
			else if((k+1)%3==0){
				array[k]="Fizz";
			}
			else if((k+1)%5==0){
				array[k]="Buzz";
			}
			else{
				array[k]=String.valueOf(k+1);
			}
		}
		return array;
	}
	public static void printArray(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
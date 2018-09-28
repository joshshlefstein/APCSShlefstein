
public class TextLab03_100Point {

	public static void main(String[] args) {
		int milli=10000123;
		System.out.println("Starting milli-seconds:	"+ milli);
		int h=milli/3600000;//change to hours
		System.out.println("Hours:			"+h);
		int r=milli%3600000;
		int min=r/60000;//leftover minutes
		System.out.println("Minutes:		"+(min));
		int r2=r%60000;
		int sec=r2/1000;
		System.out.println("Seconds:		"+(sec));
		int r3=r2%1000;
		System.out.println("Milli Seconds:		"+ r3);
	}

}

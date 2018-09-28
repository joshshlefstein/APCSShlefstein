
public class TextLab03_80Points {

	public static void main(String[] args) {
		int sec=10000;
		System.out.println("Starting seconds:	"+ sec);
		int h=sec/3600;//3600 in an hour
		System.out.println("Hours:			"+h);
		int r=sec%3600;
		int min=r/60;//remainder seconds to minutes
		System.out.println("Minutes:		"+min);
		int r2=sec%60;//remainder seconds
		System.out.println("Seconds:		"+r2);
	}

}

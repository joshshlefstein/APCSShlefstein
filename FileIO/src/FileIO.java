import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO {

	// write to a file function
	public void writeFile() { // throws means remove error and I will take care of this error later

		// try block (try to do this, if there's an error, catch the error with an
		// exception
		try {
			FileWriter file = new FileWriter("Josh.txt");
			file.write("Hello, world!\n");
			file.write("Josh Shlefstein, 17");
			file.close();

		} catch (Exception error) {
			System.out.println("Error in reading file");
		}
	}
	public void readFile() {
		try {
			FileReader fr = new FileReader("Josh.txt");
			BufferedReader br = new BufferedReader(fr);
			
			//reading in the data from the file
			String line;
			while((line = br.readLine()) !=null) {
				String[] parts = line.split(" ");
				String firstName = parts[0];
				String lastName = parts[1];
				int age = Integer.parseInt(parts[2]);
				
			}
			fr.close();//close file, unless the file will hang
		}
		catch(Exception failure) {
			System.out.println(failure);
			}
		}
	
	public static void main(String[] args) {

		FileIO f = new FileIO();
		f.writeFile();
		f.readFile();

	}
	
	
	}

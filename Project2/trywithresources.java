package java*.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt")))
		{

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
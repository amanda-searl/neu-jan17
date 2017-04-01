package class9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FindStringInFile {

	public static void main(String[] args) throws Exception {
		String file = "/Users/dosapats/test.txt";
		String content = Util.read(file);
		// readUsingUtil(content);
		readFromDataInputStream(file);
	}

	private static void readFromDataInputStream(String file) throws Exception {
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		// DataInputStream dis = new DataInputStream(fis);
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader dis = new BufferedReader(reader);
		int lines = 0;
		while (true) {

			String line = dis.readLine();
			lines++;
			if (line == null)
				break;
			if (line.contains("siva")) {
				System.out.println("Found in line -> " + lines);
				return;
			}
		}
		System.out.println("Not Found");

	}

	private static void readUsingUtil(String content) {
		boolean b = content.contains("siva");
		if (b == true) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}

}

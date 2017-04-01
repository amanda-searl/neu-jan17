package class9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Read {
	public static void main(String args[]) throws IOException {
		// D:\\dosapats\\test.txt
		File parent = new File("/Users/dosapats");
		File file = new File(parent, "test.txt");
		FileInputStream fis = new FileInputStream(file);
		// readFromFileBitByBit(fis);
		// readFromFileEntirely();
		String x = Util.read("/Users/dosapats/test.txt");
		System.out.println(x);
	}

	private static void readFromFileEntirely() throws IOException {
		String file = "/Users/dosapats/test.txt";
		System.out.println(Util.read(file));

	}

	private static void readFromFileBitByBit(FileInputStream fis) throws IOException {
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			char ch = (char) x;
			System.out.print(ch);
		}
	}
}

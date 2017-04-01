package class9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/dosapats/dummy.txt");
		if (f.exists() == false) {
			f.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(f, true);
		String output = "   I Love Seattle ";
		byte b[] = output.getBytes();
		fos.write(b);
		fos.close();
	}

}

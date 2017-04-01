package class9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Util {

	public static String read(String file) {
		try {
			File f = new File(file);
			FileInputStream fis = new FileInputStream(f);
			int available = fis.available();
			byte b[] = new byte[available];
			fis.read(b);
			String s = new String(b);
			return s;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}

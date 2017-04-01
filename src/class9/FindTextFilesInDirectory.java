package class9;

import java.io.File;

public class FindTextFilesInDirectory {

	public static void main(String[] args) {
		File dir = new File("/Users/dosapats/git");
		String ext = "txt";
		System.out.println(getFilesInDirectoryOfType(dir, ext));
	}

	public static int getFilesInDirectoryOfType(File file, String extension) {
		if (file.isDirectory() == false) {
			if (findIfFileIsOfType(file, extension))
				return 1;
			return 0;
		}
		int count = 0;
		for (File child : file.listFiles()) {
			if( child.isDirectory()){
				count = count + getFilesInDirectoryOfType(child, extension);
				continue;
			}
			if (findIfFileIsOfType(child, extension)) {
				count++;
			}
		}
		return count;
	}

	private static boolean findIfFileIsOfType(File file, String extension) {
		String path = file.getPath();
		if (path.endsWith(extension)) {
			System.out.println(file.getAbsolutePath());
			return true;
		} else {
			return false;
		}
	}

}

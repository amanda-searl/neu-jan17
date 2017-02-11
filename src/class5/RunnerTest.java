package class5;

public class RunnerTest {

	public static void main(String[] args) {
		Runner r = getRunner();
		r.run();

	}

	private static Runner getRunner() {
		if (isOldVersion()) {
			return new VersionOne();
		} else {
			return new VersionTwo();
		}
	}

	private static boolean isOldVersion() {
		// TODO Auto-generated method stub
		return false;
	}

}

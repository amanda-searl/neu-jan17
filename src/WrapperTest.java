
public class WrapperTest {
	static Float f;
	static float ff;

	public static void main(String[] args) {
		Integer i = new Integer(45);
		Double d = new Double(54.76);
		System.out.println(d.intValue());
		int ii = 45;
		System.out.println(ii);
		System.out.println(i);
		i = 32;
		System.out.println(i);
		System.out.println(f + " -> " + ff);
		for (Integer x = 0; x < 10; x++) {
			System.out.println(x);
		}

	}

}

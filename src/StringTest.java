
public class StringTest {

	public static void main(String[] args) {
		String frank = "Frank";
		String kevin = new String("Kevin");
		System.out.println(frank.length());
		System.out.println(kevin.substring(0, 2));
		StringTest st = new StringTest();
		System.out.println(st.countVowels("SivA KumAr DosapAti"));
	}

	public int countVowels(String string) {
		int counter = 0;
		char c[] = string.toCharArray();
		for (char ch : c) {
			if (isVowel(ch)) {
				counter = counter + 1;
			}
		}
		return counter;
	}

	private boolean isVowel(char c) {
		char vowels[] = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (char v : vowels) {
			if (c == v) {
				return true;
			}
		}
		return false;
	}

}

package maps;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	Map<String, String> entries = new HashMap<String, String>();

	public void addEntry(String number, String name) {
		entries.put(number, name);
	}

	public String getName(String number) {
		return entries.get(number);
	}

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.addEntry("425-283-7905", "siva");
		pb.addEntry("206-823-4757", "frank");
		pb.addEntry("706-761-0310", "amanda");

		System.out.println(pb.getName("425-283-7905"));
		System.out.println(pb.getName("706-700-8000"));

	}

}

class PhoneEntry {
	String number;
	String name;

	PhoneEntry(String number, String name) {
		this.number = number;
		this.name = name;
	}
}

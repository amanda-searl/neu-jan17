package collections;

import java.util.ArrayList;

public class PhoneBook {
	ArrayList<PhoneEntry> phoneEntries = new ArrayList<PhoneEntry>();

	public void addEntry(String number, String name) {
		PhoneEntry pe = new PhoneEntry(number, name);
		phoneEntries.add(pe);
	}

	public String getName(String number) {
		for (PhoneEntry pe : phoneEntries) {
			if (pe.number.equals(number)) {
				return pe.name;
			}
		}
		return null;
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

package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<String> c = makeArrayList();
		operateOnCollection(c);
		c = new Vector<String>();
		operateOnCollection(c);
		c = new LinkedList<String>();
		operateOnCollection(c);
		c = new HashSet<String>();
		operateOnCollection(c);
		c = new LinkedHashSet<String>();
		operateOnCollection(c);
		c = new TreeSet<String>();
		operateOnCollection(c);

	}

	private static void operateOnCollection(Collection<String> c) {
		System.out.println("Operate on -> " + c.getClass().getName());
		c.add("siva");
		c.add("george");
		c.add("amanda");
		c.add("kevin");
		c.add("kumar");
		System.out.println(c + " -> " + c.size());
		c.remove("siva");
		System.out.println(c + " -> " + c.size());
		System.out.println(c.contains("kumar"));
		c.add("kumar");
		System.out.println(c + " -> " + c.size());
		System.out.println("..........");

	}

	private static ArrayList<String> makeArrayList() {
		return new ArrayList<String>();

	}

}

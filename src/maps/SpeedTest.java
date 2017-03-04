package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SpeedTest {

	public static void main(String[] args) {
		System.out.println("Creating a List -> " + new java.sql.Time(System.currentTimeMillis()));

		ArrayList<String> names = new ArrayList<String>();
		makeNames(names, "siva", 10000000);

		System.out.println("Done creating a List -> " + new java.sql.Time(System.currentTimeMillis()));

		System.out.println("Creating a Map -> " + new java.sql.Time(System.currentTimeMillis()));

		Map<String, String> namesMap = new HashMap<String, String>();
		makeNames(namesMap, "siva", 10000000);
		System.out.println("Done creating a Map -> " + new java.sql.Time(System.currentTimeMillis()));

		long start = System.nanoTime();
		System.out.println(names.contains("siva1000000"));
		long end = System.nanoTime();
		System.out.println("Time taken for reading from list -> " + (end - start));

		start = System.nanoTime();
		System.out.println(namesMap.containsKey("siva1000000"));
		end = System.nanoTime();
		System.out.println("Time taken for reading from Map -> " + (end - start));

	}

	private static void makeNames(Map<String, String> namesMap, String name, int number) {
		for (int i = 0; i < number; i++) {
			String key = name + i;
			String value = name + i;
			namesMap.put(key, value);
		}

	}

	private static void makeNames(ArrayList<String> names, String name, int number) {
		for (int i = 0; i < number; i++) {
			names.add(name + i);
		}
	}

}

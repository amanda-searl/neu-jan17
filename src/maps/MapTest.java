package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String args[]) {
		Map<String, String> map = new HashMap<String, String>();
		operate(map);
		map = new TreeMap<String, String>();
		operate(map);
	}

	private static void operate(Map<String, String> map) {
		System.out.println(map.getClass().getName() + "-----");
		map.put("425-283-7905", "siva");
		map.put("206-823-4757", "frank");
		map.put("206-823-4700", "george");

		map.put("706-761-0310", "amanda");
		System.out.println(map + " -> " + map.size());
		map.remove("425-283-7905");
		System.out.println(map + " -> " + map.size());
		map.put("206-823-4757", "kevin");
		System.out.println(map + " -> " + map.size());
		map.put("206-823-4758", "kevin");
		System.out.println(map + " -> " + map.size());
		//map.put(null, "No Person");
		//System.out.println(map + " -> " + map.size());
		//map.put(null, "No human");
		//System.out.println(map + " -> " + map.size());

		System.out.println("-----");
	}
}

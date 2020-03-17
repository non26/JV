package coffee;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Procedure {
	void prepareRecipe(TreeMap<String, String[]> type) {
		System.out.println("-preparing recipe");
		
		for (Entry<String, String[]> entry : type.entrySet()) {
			System.out.println(entry.getKey());
			Arrays.stream(entry.getValue()).forEach(System.out::println);
		}
	}
	void boilWater() {
		System.out.println("-boilling water");
	}
	void brewCoffee() {
		System.out.println("-brewing coffee");
	}
	void pourInCap() {
		System.out.println("-pouring in cap");
	}
}

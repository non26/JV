package test_list;

import java.util.ArrayList;
import java.util.List;

public class testList {
	public static void main(String[] args) {
		List<Integer> testIntegers = new ArrayList<Integer>();
		testIntegers.add(10);
		testIntegers.add(20);
		testIntegers.add(30);
		testIntegers.add(40);
		testIntegers.add(50);
		testIntegers.remove(3);
		System.out.print(testIntegers.toString());
		
	}

}

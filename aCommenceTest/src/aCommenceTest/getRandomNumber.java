package aCommenceTest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class getRandomNumber {
	static List<Integer> range(int start, int end){
		List<Integer> rangeNumber = new ArrayList<Integer>();
		for (int i = 0; i<end-start; i++) { // end at end-1
			rangeNumber.add(start+i);
		}
		return rangeNumber;
	}
	List<Integer> getRangePositive(int digit){
		int start;
		int end;
		int d = digit -1;
		if (d==0) {
			start = 0; // lower bound 
		}else {
			start = (int) Math.pow(10, d); // lower bound 
		}
		end = (int) Math.pow(10, digit); // upper bound
		List<Integer> numberRang = getRandomNumber.range(start, end);
		return numberRang;
	}
	List<Integer> getRangePositive(int start, int end){
		if (start == end) {
			List<Integer> numberRange = new ArrayList<Integer>();
			numberRange.add(start);
			return numberRange;
		}
		List<Integer> numberRange = getRandomNumber.range(start, end);
		return numberRange;
	}
	List<Integer> getRangePositive(int start, int end, int digit){
		int lenStart = Integer.toString(start).length();
		int lenEnd = Integer.toString(end).length();
		if (lenStart == digit && lenEnd == digit) {
		}else if (lenStart<digit && digit == lenEnd) {
			int d = digit -1;
			start = (int) Math.pow(10, d);
		}else if (lenStart == digit && digit < lenEnd) {
			end = (int) Math.pow(10, digit);
		}else if (lenStart < digit && digit < lenEnd) {
			int d = digit-1;
			start = (int) Math.pow(10, d);
			end = (int) Math.pow(10, digit);
		}
		List<Integer> numberRange = getRandomNumber.range(start, end);
		return numberRange;
	}
	List<Integer> getRangeNegative(int digit){
		int start = (int) Math.pow(10, digit) - 1; // lower bound
		int end = (int) Math.pow(10, digit-1) -1; // upper bound
		List<Integer> numberRange = getRandomNumber.range(-start, -end);
		return numberRange;
	}
	List<Integer> getRangeNagetive(int start, int end){ // start must be lesser than end in negative case
		List<Integer> numberRange = getRandomNumber.range(start, end);
		return numberRange;
	}
	List<Integer> getRangeNegative(int start, int end, int digit){
		start = Math.abs(start);
		end = Math.abs(end);
		int lenStart = Integer.toString(start).length();
		int lenEnd = Integer.toString(end).length();
		if (lenStart == digit && digit == lenEnd) {
		}else if (lenStart > digit && digit == lenEnd) {
			start = (int) Math.pow(10, digit) -1;
		}else if (lenStart == digit && digit > lenEnd) {
			end = (int) Math.pow(10, digit-1) -1;
		}else if (lenStart > digit && digit > lenEnd) {
			start = (int) Math.pow(10, digit) -1; 
			end = (int) Math.pow(10, digit-1) -1;
		}
		List<Integer> numberRange = getRandomNumber.range(-start, -end);
		return numberRange;
	}
	static int randomIndex(int len) { // random an index of list
		Random random = new Random();
		int index = random.nextInt(len);
		return index;
	}
	
	public static void main(String[] args) {
		// if there's a mix number of positive and negative in the specified range
		// such as -205 to 300, use getRangePositive(0, 300) and getRangeNegative(-205, -1) and then concatenate two list
		// if there's only digit whether positive or negative, so use overload "digit" parameter method
		// if there are start and end of range whether positive or negative, so use overload "start", "end" parameter method
		// if there are start, end and digit specified, whether positive or negative, so use overload "start", "end", "digit" parameter method
		int digit = 2;
		Scanner input = new Scanner(System.in);
		getRandomNumber testRandom = new getRandomNumber();
		while (true) { // for reset
			List<Integer> negativeRange = testRandom.getRangeNegative(digit);
			while (!negativeRange.isEmpty()) { // for looping through element
				int index = getRandomNumber.randomIndex(negativeRange.size());
				int element = negativeRange.get(index);
				negativeRange.remove(index); // this will remove the random number, so it won't repeat
				System.out.println(element);
			}
			System.out.println("reset (y/n)");
			String again = input.next();
			if (again.equals("Y") || again.equals("y")) {
				continue;
			}else {
				break;
			}
		}
		input.close();
	}
}


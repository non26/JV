package testUserInput;
import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		String start = input.next();
		String end = input.next();
		String digit = input.next();
		input.close();
		System.out.println(start + " " + end + " " + digit);
		
	}

}

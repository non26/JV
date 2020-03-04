package Open_closed_game;
//import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Player {
	Boolean predictor;
	String answer = "" ;
	Boolean ai;
//	InputStream in = System.in;
//	Scanner personInput = new Scanner(System.in);
	
	public Player(Boolean pre, String ans, Boolean ai) {
		this.predictor = pre;
		this.answer = ans;
		this.ai = ai;
	}

	public Boolean getPredictor() {
		return predictor;
	}

	public void setPredictor(Boolean predictor) {
		this.predictor = predictor;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Boolean getAi() {
		return ai;
	}

	public void setAi(Boolean ai) {
		this.ai = ai;
	}
//	public String ai_random(){
//		Random aiRandom = new Random();
//		String anString = "";
//		String[] stringRandomStrings = {"C", "O"};
//		String sub;
//		int resultRandom;
//		if (this.predictor) {
//			for(int i=0; i<2; i++) {
//				resultRandom = aiRandom.nextInt(2);
//				sub = stringRandomStrings[resultRandom];
//				anString = anString.concat(sub);
//			}
//			resultRandom = aiRandom.nextInt(5); // random integer 0-4
//			anString = anString.concat(Integer.toString(resultRandom));
//		}else {
//			for(int i=0; i<2; i++) {
//				resultRandom = aiRandom.nextInt(2);
//				sub = stringRandomStrings[resultRandom];
//				anString = anString.concat(sub);
//			}
//		}
//		return anString;
//	}
//	public String personInput() {
//		Scanner personInput = new Scanner(in);
//		String inputString = "";
//		if (personInput.hasNextLine()) {
//			inputString = personInput.nextLine().toUpperCase();
//		}
////		personInput.close();
//		return inputString;
//	}
//	public static void main(String[] args) {
//		Player p1 = new Player(true, "", false);
//		while(true) {
//			System.out.println("person's input: ");
//			String outputString = p1.personInput();
//			System.out.println(outputString);
//			if (outputString.equals("C")) {
//				System.out.print("Finish");
//				break;
//			}
//		}
//		System.out.println("person output: "+outputString);
//		Player p2 = new Player(false, "", true);
//		System.out.println("ai's input: ");
//		String outputString2 = p2.ai_random();
//		System.out.println("ai random: "+outputString2);
//	}
}

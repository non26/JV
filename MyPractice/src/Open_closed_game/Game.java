package Open_closed_game;
import java.util.Random;
import java.util.Scanner;
import java.io.InputStream;

public class Game {
	final static String[] msgPredictor = {"You are the predictor", "AI is the predictor "};
	final static Boolean win = true;
	final InputStream in = System.in; 
	
	Player personPlayer;
	Player aiPlayer;
	
	public Game(Player p1, Player p2) {
		this.personPlayer = p1;
		this.aiPlayer = p2;
	}
	private static Integer countO(String str) {
		int lenStr = str.length();
		int c = 0;
		int starter = -1;
		for(int i=0; i<lenStr; i++) {
			int result = str.indexOf("O", starter+1);
			if (result != -1) {
				c++;
				starter = result;
			}
		}
		return c;
	}
	
	public String personInput() {
		Scanner personInput = new Scanner(in);
		String inputString = "";
		if (personInput.hasNextLine()) {
			inputString = personInput.nextLine().toUpperCase();
		}
//		personInput.close();
		return inputString;
	}
	
	public String ai_random(){
		Random aiRandom = new Random();
		String anString = "";
		String[] stringRandomStrings = {"C", "O"};
		String sub;
		int resultRandom;
		if (this.aiPlayer.predictor) {
			for(int i=0; i<2; i++) {
				resultRandom = aiRandom.nextInt(2);
				sub = stringRandomStrings[resultRandom];
				anString = anString.concat(sub);
			}
			resultRandom = aiRandom.nextInt(5); // random integer 0-4
			anString = anString.concat(Integer.toString(resultRandom));
		}else {
			for(int i=0; i<2; i++) {
				resultRandom = aiRandom.nextInt(2);
				sub = stringRandomStrings[resultRandom];
				anString = anString.concat(sub);
			}
		}
		return anString;
	}
	
	private Boolean checkAnswer() {
		if (this.personPlayer.predictor) {
			int lenInput = this.personPlayer.answer.length();
			int numberOfO = Integer.parseInt(this.personPlayer.answer.substring(lenInput-1, lenInput));
//			System.out.println("number of O "+numberOfO);
			String setLiteral = this.personPlayer.answer.substring(lenInput-1).concat(this.aiPlayer.answer);
			int countO = Game.countO(setLiteral);
//			System.out.println("count O "+countO);
			if (numberOfO == countO) {
				System.out.println("person win");
				return Game.win;
			}else {
				System.out.println("On one win");
				return !Game.win;
			}
		}
		else {
			if(this.aiPlayer.predictor) {
				int lenInput = this.aiPlayer.answer.length();
				int numberOfO = Integer.parseInt(this.aiPlayer.answer.substring(lenInput-1, lenInput));
//				System.out.println("number of O "+numberOfO);
				String setLiteral = this.aiPlayer.answer.substring(lenInput-1).concat(this.personPlayer.answer);
				int countO = Game.countO(setLiteral);
//				System.out.println("count O "+countO);
				if (numberOfO == countO) {
					System.out.println("ai win");
					return Game.win;
				}else {
					System.out.println("On one win");
					return !Game.win;
				}
			}
			else {
				return true;
			}
		}
	}
	private void letInputs() {
		this.personPlayer.answer = this.personInput();
		this.aiPlayer.answer = this.ai_random();
		System.out.println("AI: "+this.aiPlayer.answer);
	}
	public Boolean letPlay() {
		while (true){
			if (this.personPlayer.predictor) {
				System.out.println(Game.msgPredictor[0]+", What is your output?");
				this.letInputs();
				if (this.checkAnswer()) {
					break;
				}else {
					this.personPlayer.predictor = false;
					this.aiPlayer.predictor = true;
					continue;
				}
			}else {
				if (this.aiPlayer.predictor) {
					System.out.println(Game.msgPredictor[1]+", What is your output?");
					this.letInputs();
					if (this.checkAnswer()) {
						break;
					}else {
						this.personPlayer.predictor = true;
						this.aiPlayer.predictor = false;
						continue;
					}
				}
			}
		}
	Scanner again = new Scanner(System.in);
	System.out.println("Do you want to play it again?(y/n): ");
	String result = again.nextLine().toUpperCase();
//	again.close();
	if (result.equals("Y")) {
		return true;
	}
	else {
		System.out.println("Ok, bye.");
		 return false;
		}
	}
}
	


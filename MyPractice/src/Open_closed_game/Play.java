package Open_closed_game;

public class Play {
	public static void main(String[] args) {
		Player personPlayer = new Player(true, "", false);
		Player aiPlayer = new Player(false, "", true);
		Game game = new Game(personPlayer, aiPlayer);
		while (true) {
//			game.personPlayer.answer = personInput.nextLine();
			Boolean again = game.letPlay();
			if (again) {
				game.personPlayer.predictor = true;
				game.aiPlayer.predictor = false;
				continue;
			}else {
//				game.in.close(); error
				break;
			}
		}
	}

}

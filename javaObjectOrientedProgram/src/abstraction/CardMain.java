package abstraction;

public class CardMain {
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card();
		CardGame game = new CardGame();
		game.play(card1, card2);
		System.out.println("[카드1]"+Card.KIND+" : " +card1.getNum()+"\n"
				+"[카드2]"+Card.KIND+" : "+card2.getNum()+"\n"
				+ game.getResult());
	}
}


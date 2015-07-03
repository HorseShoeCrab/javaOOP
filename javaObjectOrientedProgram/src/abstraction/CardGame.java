package abstraction;

public class CardGame extends CardGameRule{

	@Override
	public void play(Card card1, Card card2) {

		if (card1.getNum() > card2.getNum()) {
			super.setResult("CARD 1 �¸�");
		} else if(card2.getNum() > card1.getNum()) {
			super.setResult("CARD 2 �¸�");
		} else {
			super.setResult("DRAW");
		}
		
	}

}

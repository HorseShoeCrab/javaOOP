package abstraction;

public class CardGame extends CardGameRule{

	@Override
	public void play(Card card1, Card card2) {

		if (card1.getNum() > card2.getNum()) {
			super.setResult("CARD 1 ½Â¸®");
		} else if(card2.getNum() > card1.getNum()) {
			super.setResult("CARD 2 ½Â¸®");
		} else {
			super.setResult("DRAW");
		}
		
	}

}

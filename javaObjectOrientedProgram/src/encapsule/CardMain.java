package encapsule;

public class CardMain {
	public static void main(String[] args) {
		CardVO card1 = new CardVO("heart", 5);
		CardVO card2 = new CardVO("heart", 7);
		System.out.println("�÷��̾�2�� �� ī��� "+card2.getMsg()+" �̰�, "
						  +"�÷��̾�1�� �� ī���"+card1.getMsg()
						  +" �̹Ƿ�\n"+" �÷��̾�2�� �̰���ϴ�");
	}
}


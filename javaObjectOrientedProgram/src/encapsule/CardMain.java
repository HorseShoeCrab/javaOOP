package encapsule;

public class CardMain {
	public static void main(String[] args) {
		CardVO card1 = new CardVO("heart", 5);
		CardVO card2 = new CardVO("heart", 7);
		System.out.println("플레이어2가 낸 카드는 "+card2.getMsg()+" 이고, "
						  +"플레이어1이 낸 카드는"+card1.getMsg()
						  +" 이므로\n"+" 플레이어2가 이겼습니다");
	}
}


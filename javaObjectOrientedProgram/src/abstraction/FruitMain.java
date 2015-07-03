package abstraction;

public class FruitMain {
	public static void main(String[] args) {
		/*
		 * 인터페이스는 객체를 만들 수 없다.
		 * 즉, FruitInterface f = new FruitInterface();
		 * 이것은 에러를 발생시킨다.
		 */
		FruitInterface apple = new AppleImpl();
		// 타입 정의만 인터페이스로 하고
		// 생성자 메소드는 인터페이스를 구현한 클래스를 가지고
		// 객체를 생성
		// AppleImpl apple = new AppleImpl(); 잘못된 코딩
		apple.display("맛있는");
		FruitInterface banana = new BananaImpl();
		banana.display("오래된");
		FruitInterface orange = new OrangeImpl();
		orange.display("비싼");
		// 오렌지 클래스에 있는 getCount() 를 호출
		// orange.getCount(); 이것은 정의는 되어있되 호출은 되지 않음
		/*
		 * 위 처럼 되는 이유는 주어진 역할만 수행하라는 뜻
		 */
	}
}

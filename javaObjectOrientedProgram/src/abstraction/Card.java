package abstraction;

public class Card {
	static final int WIDTH=150;
	static final int HEGIHT=300;
	/*
	 * 4가지 문양 중 하트 무늬만 가지고 플레이 함.
	 */
	public static final String KIND = "하트";
	private int num;

	// 생성자 단축키 : CTRL + Space
	public Card() {
		this.num = (int) ((Math.random()*13)+1);
		/*
		 * Math 클래스는 수학과 관련된 클래스 Math.random() 메소드는 범위내에서 램던 숫자를 
		 * 발생시키는 역할 *13 은 리미트값, +1 은 스타트값
		 */
	}
	public int getNum() {
		return num;
	}
	
}

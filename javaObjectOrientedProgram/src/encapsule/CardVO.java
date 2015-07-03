package encapsule;

public class CardVO {
	String msg;
	/*
	 * 카드 넓이는 일정 -> 고정값이 주어짐 -> 상수 선언
	 */
	static final int WIDTH=150;
	static final int HEGIHT=300;

	public CardVO(String kind, int num) {
		this.msg = kind+":"+num;
	}

	// setMsg() 를 지운다는 것은 임의로 msg 를 바꿀 수 없고 
	// 단지, 읽어 오기만 한다는 readOnly 의 의미
	public String getMsg() {
		return msg;
	}

}

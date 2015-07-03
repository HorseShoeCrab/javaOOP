package inheritance;

public class Cellphone extends Phone{
	private boolean portable; 
	private String move;
	
	/*
	 * 필드에 있는 인스턴스 변수의 타입이 boolean 인 경우
	 * get... set... 이 아니라
	 * is... set... 으로 자동 생성된다.
	 * 이것은 오로지 boolean 타입일 경유만 해당된다.
	 */
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if (portable == true) {
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	
}

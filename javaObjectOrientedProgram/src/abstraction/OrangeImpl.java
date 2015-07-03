package abstraction;

public class OrangeImpl implements FruitInterface{

	@Override
	public void display(String str) {
		System.out.println(str+ " 오렌지입니다.");
		
	}
	/*
	 * 인터페이스에 정의된 추상 클래스가 아닌 
	 * 구현된 클래스에서 추가로 메소드를 더 만듬
	 */
	public int getCount(){
		return 100;
	}
}

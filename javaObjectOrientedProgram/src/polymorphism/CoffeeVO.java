package polymorphism;

public class CoffeeVO {
	private String msg;
	int price, money; // 통일타입 변수선언 방식
	public CoffeeVO() {
		this.msg = "커피 자판기 입니다.";		
	}
	public CoffeeVO(int price) {
		this.price = price; // 위 필드에 선언된 인스턴스 변수, = price 의 값은 생성자 메소드에 파라미터로 넘어 온 값
							// 인스턴스 변수에 파라미터 값을 할당한다는 의미
		this.msg = "한 잔에 "+price+" 입니다.";
	}
	public CoffeeVO(int price, int money, String coffee) {
		this.msg = coffee + "나왔습니다." 
				+"거스름돈은"+(money-price)+"원 입니다";
	}
	public String getMsg() {
		return msg;
	}
}

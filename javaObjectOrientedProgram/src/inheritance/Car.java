package inheritance;

public class Car {
	public static final String CAR = "자동차"; // static 은 Car.CAR 로 호출 가능하게 끔 클래스변수로 만드는 키워드
	private String companyName;
	
	public Car() {} // 파라미터가 없는 생성자는 일부러 만들지 않아도 클래스 내부에 있는 것으로 자동 생성
					// 따라서 위처럼 생성하는 것은 불필요
		
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}

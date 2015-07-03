package inheritance;
/*
 * Car 예제를 통한 상속의 의미
 - 키워드 extends 를 사용하면
 - 두 클래스 사이에 부모자식 관계가 성립한다.
 - 상속관계가 성립되면 자식 클래스는
 - 부모클래스의 모든 인스턴스 변수와 메소드를 사용가능하게 된다.
 - 다만 부모클래스의 인스턴스 변수가 pricate 이면
 - getter/setter 를 사용하는데 이 때 부모의 메소드는
 - super 라는 키워드를 통해 가져온다.
 */
public class HyundaiCar extends Car{
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}

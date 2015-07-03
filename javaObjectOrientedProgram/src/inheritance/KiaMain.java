package inheritance;

public class KiaMain {
	public static void main(String[] args) {
		KiaCar k5 = new KiaCar();
		k5.setCompanyName("기아");
		k5.setCarName("K5");
		System.out.println(k5.getCompanyName()+"\t"+k5.getCarName()+"\t"+Car.CAR);
		// CAR 는 인스턴스가 아니라 클래스 변수이다. 따라서 인스턴스(k5.CAR) 가 아니라 클래스(Car.CAR) 로 호출해야 한다.
	}
}

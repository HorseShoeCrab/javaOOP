package inheritance;

public class KiaMain {
	public static void main(String[] args) {
		KiaCar k5 = new KiaCar();
		k5.setCompanyName("���");
		k5.setCarName("K5");
		System.out.println(k5.getCompanyName()+"\t"+k5.getCarName()+"\t"+Car.CAR);
		// CAR �� �ν��Ͻ��� �ƴ϶� Ŭ���� �����̴�. ���� �ν��Ͻ�(k5.CAR) �� �ƴ϶� Ŭ����(Car.CAR) �� ȣ���ؾ� �Ѵ�.
	}
}

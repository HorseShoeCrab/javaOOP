package inheritance;
/*
 * Car ������ ���� ����� �ǹ�
 - Ű���� extends �� ����ϸ�
 - �� Ŭ���� ���̿� �θ��ڽ� ���谡 �����Ѵ�.
 - ��Ӱ��谡 �����Ǹ� �ڽ� Ŭ������
 - �θ�Ŭ������ ��� �ν��Ͻ� ������ �޼ҵ带 ��밡���ϰ� �ȴ�.
 - �ٸ� �θ�Ŭ������ �ν��Ͻ� ������ pricate �̸�
 - getter/setter �� ����ϴµ� �� �� �θ��� �޼ҵ��
 - super ��� Ű���带 ���� �����´�.
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

package inheritance;

public class Car {
	public static final String CAR = "�ڵ���"; // static �� Car.CAR �� ȣ�� �����ϰ� �� Ŭ���������� ����� Ű����
	private String companyName;
	
	public Car() {} // �Ķ���Ͱ� ���� �����ڴ� �Ϻη� ������ �ʾƵ� Ŭ���� ���ο� �ִ� ������ �ڵ� ����
					// ���� ��ó�� �����ϴ� ���� ���ʿ�
		
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}

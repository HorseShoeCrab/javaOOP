package polymorphism;

public class CoffeeVO {
	private String msg;
	int price, money; // ����Ÿ�� �������� ���
	public CoffeeVO() {
		this.msg = "Ŀ�� ���Ǳ� �Դϴ�.";		
	}
	public CoffeeVO(int price) {
		this.price = price; // �� �ʵ忡 ����� �ν��Ͻ� ����, = price �� ���� ������ �޼ҵ忡 �Ķ���ͷ� �Ѿ� �� ��
							// �ν��Ͻ� ������ �Ķ���� ���� �Ҵ��Ѵٴ� �ǹ�
		this.msg = "�� �ܿ� "+price+" �Դϴ�.";
	}
	public CoffeeVO(int price, int money, String coffee) {
		this.msg = coffee + "���Խ��ϴ�." 
				+"�Ž�������"+(money-price)+"�� �Դϴ�";
	}
	public String getMsg() {
		return msg;
	}
}

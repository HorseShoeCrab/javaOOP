package abstraction;

public class FruitMain {
	public static void main(String[] args) {
		/*
		 * �������̽��� ��ü�� ���� �� ����.
		 * ��, FruitInterface f = new FruitInterface();
		 * �̰��� ������ �߻���Ų��.
		 */
		FruitInterface apple = new AppleImpl();
		// Ÿ�� ���Ǹ� �������̽��� �ϰ�
		// ������ �޼ҵ�� �������̽��� ������ Ŭ������ ������
		// ��ü�� ����
		// AppleImpl apple = new AppleImpl(); �߸��� �ڵ�
		apple.display("���ִ�");
		FruitInterface banana = new BananaImpl();
		banana.display("������");
		FruitInterface orange = new OrangeImpl();
		orange.display("���");
		// ������ Ŭ������ �ִ� getCount() �� ȣ��
		// orange.getCount(); �̰��� ���Ǵ� �Ǿ��ֵ� ȣ���� ���� ����
		/*
		 * �� ó�� �Ǵ� ������ �־��� ���Ҹ� �����϶�� ��
		 */
	}
}

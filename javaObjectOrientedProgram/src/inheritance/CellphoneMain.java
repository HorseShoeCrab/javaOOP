package inheritance;

import java.util.Scanner;

public class CellphoneMain {
	public static void main(String[] args) {
		Cellphone motorola = new Cellphone();
		// motorla.set...("����ζ�");
		System.out.println("����ζ�"+"�� ����մϴ�");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ�� ��� : ");
		motorola.setCall(scanner.next());
		// motorola.set...("ȫ�浿")
		motorola.setPortable(true);
		System.out.println(motorola.getCall()+"�� ��ȭ�մϴ�. "+motorola.getMove());
		
		scanner.close();
	}
}

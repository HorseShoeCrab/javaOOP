package encapsule;
import java.util.Scanner;

public class LeapYearMain {

	public static void main(String[] args) {
		
		LeapYearVO leapYearVO = new LeapYearVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�⵵�� �Է��Ͻÿ�");
		int year = scanner.nextInt();;
		// Scanner scanner = new Scanner(System.in);
		// int year = scanner.nextInt();
		// Scanner �� Ŭ���� �̸�
		// Scanner �� �潺�Ͻ� ���� �̸� -> ��ü��
		// new �� ������ Ű����
		// Scanner() �� ������
		// System.in �� �Ķ����(�Ű�����)
		
		// Ŭ���� �̸��� �ݵ�� ������ ����ִ� Ŭ���� �̸��� ��ġ
		//��ü(�ν��Ͻ� ����) �� Ŭ���� �̸��� ������ ��� ��
		// �ٸ�, �޼ҵ带 ȣ���� ��� ����� �ν��Ͻ� ��������� ��ġ
		String msg = leapYearVO.getLeapYear(year); // �Ķ���ͷ� ���� ����
		System.out.println(msg);
		
		scanner.close();
	}
}

package encapsule;

import java.util.Scanner;

// ��ձ��ϴ� ������ ������������ �ڵ��� �ҽ�
public class Average {
	public static void main(String[] args) {
		String hulk="", iron="", hawk="";
		int hulkKor=0, hulkEng=0, hulkTot=0, hulkAvg=0,
				ironKor=0, ironEng=0, ironTot=0, ironAvg=0,
				hawkKor=0, hawkEng=0, hawkTot=0, hawkAvg=0;
		/* ���ݱ��� ������ ������ ��������
		 * ������ ����� ����(������)�� ���� ����
		 * �޼ҵ� ���ο� ����Ǹ� ��������
		 * ���������� Ư¡
		 * 1. �ݵ�� �ʱ�ȭ
		 * 2. ���� �޼ҵ� ���ο� ������ Ÿ���� ������ �̸��� ���� �Ұ�
		 * 3. �޼ҵ尡 ������ ������ ���ŵ�
		 */
		Scanner scanner = new Scanner(System.in);
		//�̸�����
		hulk ="��ũ";
		iron ="���̾�";
		hawk ="ȣũ";
		//��������
		System.out.println("��ũ�� �������� : ");
		hulkKor = scanner.nextInt();
		System.out.println("��ũ�� �������� : ");
		hulkEng = scanner.nextInt();
		System.out.println("���̾��� �������� : ");
		ironKor = scanner.nextInt();
		System.out.println("���̾��� �������� : ");
		ironEng = scanner.nextInt();
		System.out.println("ȣũ�� �������� : ");
		hawkKor = scanner.nextInt();
		System.out.println("ȣũ�� �������� : ");
		hawkEng = scanner.nextInt();
		
		// ������ ��հ��
		hulkTot=hulkKor+hulkEng;
		hulkAvg=hulkTot/2;
		ironTot=ironKor+ironEng;
		ironAvg=ironTot/2;
		hawkTot=hawkKor+hawkEng;
		hawkAvg=hawkTot/2;
		
		//���
		System.out.println("==="+hulk+"�� ����ǥ===");
		System.out.println("���� :" + hulkKor);
		System.out.println("���� :" + hulkEng);
		System.out.println("hulk�� �հ� : " + hulkTot);
		System.out.println("hulk�� ��� : " + hulkAvg);
		System.out.println("==="+iron+"�� ����ǥ===");
		System.out.println("���� :" + ironKor);
		System.out.println("���� :" + ironEng);
		System.out.println("iron�� �հ� : " + ironTot);
		System.out.println("iron�� ��� : " + ironAvg);
		System.out.println("==="+hawk+"�� ����ǥ===");
		System.out.println("���� :" + hawkKor);
		System.out.println("���� :" + hawkEng);
		System.out.println("hawk�� �հ� : " + hawkTot);
		System.out.println("hawk�� ��� : " + hawkAvg);
		
		// ���ϴ� �ܾ �ٲٴ� ��Ŭ���� ����Ű : CTRl + F + replace ��ư 
		scanner.close();
	}
}

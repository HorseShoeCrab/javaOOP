package encapsule;

import java.util.Scanner;

public class KaupMain {
	
	public static void main(String[] args){
		
		KaupVO kaupVO = new KaupVO(); // ��ü���� ���� : Ŭ������ ��ü�� = new �����ڸ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		
		System.out.println("�����Ը� �Է��ϰԿ�");
		double weight = scanner.nextDouble();
		
		String msg = kaupVO.getKaup(height, weight); // �ν��Ͻ� �������� = ��������).�޼ҵ��̸�
										// ��ü�� �޼ҵ带 ȣ���ϴ� ����
										// height, weight : �Ķ���ͷ� ���� �����ϴ� ����
		System.out.println(msg+"\n");
		System.out.println("Ű = "+height+"\n������ = "+weight+"\nī�������� = "+weight/(height*height)*10000);
	    scanner.close();	
	}
}



package encapsule;

import java.util.Scanner;

public class SimpleAccountMain {
	
	public static void main(String[] args) {
		/*
		 ��ü������� ���� ��ɿ� ���� ����� ���ȭ ��Ų �� ���뼺�� ���̱� ���� ���߹��
		 */
		Scanner scanner = new Scanner(System.in);
		
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();
		String inputName = scanner.next();
		int inputMoney = scanner.nextInt();
		
		String name = simpleAccountVO.name(inputName);
		int jango = simpleAccountVO.jango(inputMoney);
		System.out.println(name+"��"+inputMoney+"���� �ԱݵǾ����ϴ�"+"�ܰ��"+jango+"�����Դϴ�");
		
		scanner.close();
	}
}

//Account account = new Account();
/*
* Account : Ŭ���� �̸�
* account : �ν��Ͻ� �̸�(��ü)
* new : ������ Ű����
* Account : ������ �޼ҵ�
*/
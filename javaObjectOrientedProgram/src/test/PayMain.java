package test;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 === ȫ�浿�� 6�� �޿����� ===
		 �޿� : 300
		 ���� : 30
		 �Ǳ޿� : 270
		 === �������� 6�� �޿����� ===
		 �޿� : 400
		 ���� : 40
		 �Ǳ޿� : 360
		 */
		
		PayVO hong = new PayVO(); // Ŭ������ ���� hong �̶�� ��ü ��������; new ���� ������
		PayVO kang = new PayVO(); 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		hong.setName(scanner.next());
		System.out.println(hong.getName()+"�� �޿� : ");
		hong.setSalary(scanner.nextInt());
		
		
		// �� ����
		System.out.println("�̸��� �Է����ּ���");
		kang.setName(scanner.next());
		System.out.println(kang.getName()+"�� �޿� : ");
		kang.setSalary(scanner.nextInt());
	
		
		
		// �Ǳ޿� ���
		hong.setIncome(hong.getSalary());
		kang.setIncome(kang.getSalary());
		/*
		 * �ν��Ͻ� ���� : �ν��Ͻ�() �� getter, setter �� ȣ���ϴ� �ʵ尪
		 * Ŭ���� ���� : Ŭ������ ���� ȣ���ϴ� �ʵ尪
		 */
		
		// ���
		System.out.println("=== "+ hong.getName()+"�� �޿����� ===");
		System.out.println("�޿� : "+ hong.getSalary());
		System.out.println("�Ǳ޿� : "+ hong.getIncome());
		System.out.println("=== "+ kang.getName()+"�� �޿����� ===");
		System.out.println("�޿� : "+ kang.getSalary());
		System.out.println("�Ǳ޿� : "+ kang.getIncome());
		
		scanner.close();
	}
}

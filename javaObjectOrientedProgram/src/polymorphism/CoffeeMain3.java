package polymorphism;

/*	�Ʒ� ��ó�� �ϳ��� Ŭ������ ������ 
	��� �ݺ��ؼ� ���� �ٸ� ��ü�� ������ ��
	������ ��ɿ� ���� �ݺ� ����ϴ� ���� 
	������ �����ε��̶�� �Ѵ�
	������ �����ε� : ������ ������ �ݺ�
	�޼ҵ� �����ε� : �޼ҵ带 �Ķ���͸� �ٸ� ���·� �������� ���� �̸����� ����	*/

import java.util.Scanner;

public class CoffeeMain3 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());
		System.out.println("Ŀ�� �� �� ������ �����Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
		System.out.println("���� �����ÿ�."+" ������ "+price+"�Դϴ�.");
		int money = scanner.nextInt();
		System.out.println("Ŀ�Ǹ� �����Ͻÿ�.");
		String coffeeType = scanner.next();
		CoffeeVO coffeeExchange = new CoffeeVO(price, money, coffeeType);
		System.out.println(coffeeExchange.getMsg());
		
		scanner.close();
	}
}

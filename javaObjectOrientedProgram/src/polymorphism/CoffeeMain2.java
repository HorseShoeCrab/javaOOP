package polymorphism;

import java.util.Scanner;

// Ŀ�� ��üŬ������ ���� ������ �����ε��� �����غ��� ����Ŭ����
// �����ε� = ������(polymorphism)
public class CoffeeMain2 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());
		System.out.println("Ŀ�� �� �� ������ �����Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
		
		scanner.close();
	}
}

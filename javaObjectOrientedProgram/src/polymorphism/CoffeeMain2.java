package polymorphism;

import java.util.Scanner;

// 커피 객체클래스를 통해 생성자 오버로딩을 이해해보는 실행클래스
// 오버로딩 = 다형성(polymorphism)
public class CoffeeMain2 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());
		System.out.println("커피 한 잔 가격을 설정하시오");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
		
		scanner.close();
	}
}

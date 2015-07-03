package polymorphism;

/*	아래 예처럼 하나의 클래스를 가지고 
	계속 반복해서 서로 다른 객체를 생성한 후
	여러번 기능에 따라 반복 사용하는 것을 
	생성자 오버로딩이라고 한다
	생성자 오버로딩 : 생성자 여러번 반복
	메소드 오버로딩 : 메소드를 파라미터만 다른 형태로 여러개의 동일 이름으로 선언	*/

import java.util.Scanner;

public class CoffeeMain3 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());
		System.out.println("커피 한 잔 가격을 설정하시오");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
		System.out.println("돈을 넣으시오."+" 가격은 "+price+"입니다.");
		int money = scanner.nextInt();
		System.out.println("커피를 선택하시오.");
		String coffeeType = scanner.next();
		CoffeeVO coffeeExchange = new CoffeeVO(price, money, coffeeType);
		System.out.println(coffeeExchange.getMsg());
		
		scanner.close();
	}
}

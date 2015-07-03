package encapsule;

import java.util.Scanner;

public class SimpleAccountMain {
	
	public static void main(String[] args) {
		/*
		 객체지향언어는 식을 기능에 따라 나누어서 모듈화 시킨 후 재사용성을 높이기 위한 개발방식
		 */
		Scanner scanner = new Scanner(System.in);
		
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();
		String inputName = scanner.next();
		int inputMoney = scanner.nextInt();
		
		String name = simpleAccountVO.name(inputName);
		int jango = simpleAccountVO.jango(inputMoney);
		System.out.println(name+"씨"+inputMoney+"만원 입금되었습니다"+"잔고는"+jango+"만원입니다");
		
		scanner.close();
	}
}

//Account account = new Account();
/*
* Account : 클래스 이름
* account : 인스턴스 이름(객체)
* new : 생성자 키워드
* Account : 생성자 메소드
*/
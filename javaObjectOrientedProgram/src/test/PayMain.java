package test;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 === 홍길동의 6월 급여내역 ===
		 급여 : 300
		 세금 : 30
		 실급여 : 270
		 === 강감찬의 6월 급여내역 ===
		 급여 : 400
		 세금 : 40
		 실급여 : 360
		 */
		
		PayVO hong = new PayVO(); // 클래스를 통한 hong 이라는 객체 생성문법; new 부터 생성자
		PayVO kang = new PayVO(); 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		hong.setName(scanner.next());
		System.out.println(hong.getName()+"의 급여 : ");
		hong.setSalary(scanner.nextInt());
		
		
		// 값 저장
		System.out.println("이름을 입력해주세요");
		kang.setName(scanner.next());
		System.out.println(kang.getName()+"의 급여 : ");
		kang.setSalary(scanner.nextInt());
	
		
		
		// 실급여 계산
		hong.setIncome(hong.getSalary());
		kang.setIncome(kang.getSalary());
		/*
		 * 인스턴스 변수 : 인스턴스() 가 getter, setter 로 호출하는 필드값
		 * 클래스 변수 : 클래스가 직접 호출하는 필드값
		 */
		
		// 출력
		System.out.println("=== "+ hong.getName()+"의 급여내역 ===");
		System.out.println("급여 : "+ hong.getSalary());
		System.out.println("실급여 : "+ hong.getIncome());
		System.out.println("=== "+ kang.getName()+"의 급여내역 ===");
		System.out.println("급여 : "+ kang.getSalary());
		System.out.println("실급여 : "+ kang.getIncome());
		
		scanner.close();
	}
}

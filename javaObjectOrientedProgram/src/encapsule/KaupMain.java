package encapsule;

import java.util.Scanner;

public class KaupMain {
	
	public static void main(String[] args){
		
		KaupVO kaupVO = new KaupVO(); // 객체생성 패턴 : 클래스명 객체명 = new 생성자명
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		
		System.out.println("몸무게를 입력하게요");
		double weight = scanner.nextDouble();
		
		String msg = kaupVO.getKaup(height, weight); // 인스턴스 참조변수 = 참조변수).메소드이름
										// 객체가 메소드를 호출하는 패턴
										// height, weight : 파라미터로 값을 전달하는 역할
		System.out.println(msg+"\n");
		System.out.println("키 = "+height+"\n몸무게 = "+weight+"\n카우프지수 = "+weight/(height*height)*10000);
	    scanner.close();	
	}
}



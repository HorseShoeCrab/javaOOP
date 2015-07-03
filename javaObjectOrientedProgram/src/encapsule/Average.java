package encapsule;

import java.util.Scanner;

// 평균구하는 로직을 절차지향으로 코딩한 소스
public class Average {
	public static void main(String[] args) {
		String hulk="", iron="", hawk="";
		int hulkKor=0, hulkEng=0, hulkTot=0, hulkAvg=0,
				ironKor=0, ironEng=0, ironTot=0, ironAvg=0,
				hawkKor=0, hawkEng=0, hawkTot=0, hawkAvg=0;
		/* 지금까지 선언한 변수는 지역변수
		 * 변수는 선언된 영역(스코프)에 따라 구별
		 * 메소드 내부에 선언되면 지역변수
		 * 지역변수의 특징
		 * 1. 반드시 초기화
		 * 2. 같은 메소드 내부에 동일한 타입의 동일한 이름을 생성 불가
		 * 3. 메소드가 끝나면 변수는 제거됨
		 */
		Scanner scanner = new Scanner(System.in);
		//이름저장
		hulk ="헐크";
		iron ="아이언";
		hawk ="호크";
		//정수저장
		System.out.println("헐크의 국어점수 : ");
		hulkKor = scanner.nextInt();
		System.out.println("헐크의 영어점수 : ");
		hulkEng = scanner.nextInt();
		System.out.println("아이언의 국어점수 : ");
		ironKor = scanner.nextInt();
		System.out.println("아이언의 영어점수 : ");
		ironEng = scanner.nextInt();
		System.out.println("호크의 국어점수 : ");
		hawkKor = scanner.nextInt();
		System.out.println("호크의 영어점수 : ");
		hawkEng = scanner.nextInt();
		
		// 총점과 평균계산
		hulkTot=hulkKor+hulkEng;
		hulkAvg=hulkTot/2;
		ironTot=ironKor+ironEng;
		ironAvg=ironTot/2;
		hawkTot=hawkKor+hawkEng;
		hawkAvg=hawkTot/2;
		
		//출력
		System.out.println("==="+hulk+"의 성적표===");
		System.out.println("국어 :" + hulkKor);
		System.out.println("영어 :" + hulkEng);
		System.out.println("hulk의 합계 : " + hulkTot);
		System.out.println("hulk의 평균 : " + hulkAvg);
		System.out.println("==="+iron+"의 성적표===");
		System.out.println("국어 :" + ironKor);
		System.out.println("영어 :" + ironEng);
		System.out.println("iron의 합계 : " + ironTot);
		System.out.println("iron의 평균 : " + ironAvg);
		System.out.println("==="+hawk+"의 성적표===");
		System.out.println("국어 :" + hawkKor);
		System.out.println("영어 :" + hawkEng);
		System.out.println("hawk의 합계 : " + hawkTot);
		System.out.println("hawk의 평균 : " + hawkAvg);
		
		// 원하는 단어만 바꾸는 이클립스 단축키 : CTRl + F + replace 버튼 
		scanner.close();
	}
}

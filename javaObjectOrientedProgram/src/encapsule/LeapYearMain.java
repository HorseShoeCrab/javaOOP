package encapsule;
import java.util.Scanner;

public class LeapYearMain {

	public static void main(String[] args) {
		
		LeapYearVO leapYearVO = new LeapYearVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력하시오");
		int year = scanner.nextInt();;
		// Scanner scanner = new Scanner(System.in);
		// int year = scanner.nextInt();
		// Scanner 는 클래스 이름
		// Scanner 는 잍스턴스 변수 이름 -> 객체명
		// new 는 생성자 키워드
		// Scanner() 는 생성자
		// System.in 은 파라미터(매개변수)
		
		// 클래스 이름은 반드시 로직이 담겨있는 클래스 이름과 일치
		//객체(인스턴스 변수) 는 클래스 이름과 관련이 없어도 됨
		// 다만, 메소드를 호출할 경우 선언된 인스턴스 변수명과는 일치
		String msg = leapYearVO.getLeapYear(year); // 파라미터로 값을 전달
		System.out.println(msg);
		
		scanner.close();
	}
}

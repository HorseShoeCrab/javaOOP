package encapsule;
/*
main() 는 콘솔창에 입력과 출력의 기능 담당
따라서 Scanner 는 main() 에 종속
*/ 



// 메인메소드에서 모듈화 로직의 분리예제
public class LeapYearVO {
	
		// 메소드 구성 형태 : 접근제한자 + 리턴타입 + 메소드이름 + () + {}
		// () 는 파라미터(매개변수)가 들어오는 위치, 빈공간일 경우도 있음
		// {} 메소드 바디라고 부르며 구문(statement) 가 위치함
		// 접근제한자는 권한(퍼미션) 을 구분하는 역할
		// 리턴타입은 메소드가 반환하는 값이 있을 경우 설정하고 없으면 void
		 public String getLeapYear(int year){ // 파라미터로 값을 받는 형

			
			String msg = "";
			if(year % 400 == 0){
				msg = "윤년";
			}else if(year % 100 == 0){
				msg = "평년";
			}else if(year % 4 == 0){
				msg = "윤년";
			}else{
				msg = "평년";
			} // 필터링 방식은 결과값을 크개 주는 범위부터 작은 방향으로 진행
			return msg;
		}
		 // 출력값을 독립시키기 위해서 메소드에 리턴타입을 void 가 아닌 리턴값에
		 // 따른 데이터 타입을 주면 된다.
}

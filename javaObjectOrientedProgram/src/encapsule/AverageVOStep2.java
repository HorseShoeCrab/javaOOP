package encapsule;

public class AverageVOStep2 {
	/*
	 *클래스 바로 밑(필드) 에 선언된 변수는 인스턴스 변수라 하며
	 *이 인스턴스 변수는 초기화를 해도 되고
	 *안해도 되는 데 공용으로 사용하기
	 *때문에 대부분 초기화를 하지 않는다
	 *그리고 하지 않아도 문법적 에러가 발생하지 않는다
	 */
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	// 합계를 구하는 기능을 main() 에서 가져와서 감춘다
	
	public int calcTot(int kor, int eng){
		return kor+eng;
	    //  이 때 tot 는 지역변수 이다. 따라서 초기화 값을 입력해야함
		/*tot = kor+eng;
		return tot;*/
	}
	
	// 평균을 구하는 기능을 main() 에서 가져와서 감춘다
	public double calcAvg(int tot){
		return tot/2;
	}
		
}

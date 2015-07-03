package encapsule;
// 생성자만으로 삼각형 넓이 구하기
public class TriangleVO {
	/*
	 * 객체 클래스는 필드영역에 멤버변수(인스턴스변수 + 클래스변수) 와
	 * 메서드영역에 멤버메서드로 구성된다
	 * 거기에 특수한 메소드인 생성자가 가운데 위치한다
	 */
	private double area;

	public TriangleVO(double width, double height) {
		this.area = width*height/2;
	}
	public double getArea() {
		return area;
	}

}

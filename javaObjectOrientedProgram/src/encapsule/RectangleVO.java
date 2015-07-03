package encapsule;

public class RectangleVO {
	// 동일한 타입의 변수 선언시 반복되는 타입은 생략가능
	private int width, height, area;
	
	// 생성자 자동완성 단축키 : CTRL + Space
	public RectangleVO() {
		// 이것은 디폴트 생성자로써 파라미터가 없음
		// 보이지 않아도 내부적으로 완성되어 있음
		/*
		 * 이것을 호출(call) 한 이유는
		 * 생성자를 여러개 만들어서 사용하려고 하는데, 이것을 오버로딩이라고 함
		 */
		// 오버로딩을 쉽게 하는 단축방법
		this(0,0);
		
	}

	public RectangleVO(int width, int height) {
		this.area = width*height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int width, int height) {
		this.area = width * height;
	}
}

package encapsule;

import java.util.Scanner;

public class RectangleMain2 {
	public static void main(String[] args) {
		// 생성자로 면접구하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로길이 입력 :");
		int width = scanner.nextInt();
		System.out.println("세로길이 입력 :");
		int height = scanner.nextInt();
		RectangleVO2 rectangle = new RectangleVO2(width, height);
		System.out.println("면적 :"+rectangle.getArea());
		
		scanner.close();
	}
}

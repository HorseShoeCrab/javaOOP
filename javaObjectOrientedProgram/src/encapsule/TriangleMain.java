package encapsule;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로길이 입력 :");
		double width = scanner.nextDouble();
		System.out.println("세로길이 입력 :");
		double height = scanner.nextDouble();
		
		TriangleVO triangle = new TriangleVO(width, height);
		System.out.println("면적 :"+triangle.getArea());
		
		scanner.close();
	}
}

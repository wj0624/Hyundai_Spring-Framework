package net.developia.oop4;

public class ShapeTest {

	public static void main(String[] args) {
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
	}
	
	private static void printArea(Shape s){
		s.area();
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("반지름이 " + c.r + " 인 원의 넓이는 " + c.res + " 입니다.");
		}
		else if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("가로, 세로 : " + r.w + " , " + r.h + " 인 직사각형의 넓이는 " + r.res + " 입니다.");
		}
		else if(s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println("가로, 세로 : " + t.w + " , " + t.h + " 인 삼각형의 넓이는 " + t.res + " 입니다.");
		}
		System.out.println(s.res);
	}
}

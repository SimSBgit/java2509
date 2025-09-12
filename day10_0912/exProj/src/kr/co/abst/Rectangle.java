package kr.co.abst;

public class Rectangle extends Diagram{

	public Rectangle(String color, double x, double y, double w, double h) {
		super(color, x, y);
	}

	@Override
	String getShapeType() {
		
		return "나는 사각형이야";
	}
	
	
}

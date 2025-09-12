package kr.co.abst;

public abstract class Diagram {

	String color;
	double x;
	double y;
	
	public Diagram(String color, double x, double y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	abstract String getShapeType();
	
	
//	public int CircleExtent() {
//		
//		return result;
//	}
}

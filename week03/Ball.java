public class Ball {
	private String color = "red"; // 초기화가 가능하다
	private float size;
	private String shape;
	
	public Ball() {
		color = "white";
		size = 0;
		shape = "None";
	}
	
	public Ball(String c, float s, String sh) {
		color = c;
		size = s;
		shape = sh;
	}
	
	void setBallColor(String ballColor) {
		color = ballColor;
	}
	void setBallSize(float ballSize) {
		size = ballSize;
	}
	void setBallShape(String ballShape) {
		shape = ballShape;
	}
	
	String getColor() {
		return color;
	}
	float getSize() {
		return size;
	}
	String getShape() {
		return shape;
	}
}

public class BallMain {
	public static void main(String[] args) {
		//Ball football = new Ball();
		Ball football = new Ball("black", 10.5f, "circle");
		System.out.println(football.getColor());
		System.out.println(football.getSize());
		System.out.println(football.getShape());
		/* bad
		football.color = "blue";
		football.shape = "circle";
		football.size = 15.2f;
		*/
		// good
		football.setBallColor("blue");
		football.setBallShape("circle");
		football.setBallSize(15.2f);
	}
}


public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle shapeTriangle = new Triangle();

		Shape shape = shapeTriangle;
		shape.height = 10;
		shape.draw();
	}

}

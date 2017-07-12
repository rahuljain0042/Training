
public class Triangle extends Shape {

	// Triangle(int height, int width, int length) {
	// super(height, width, length);
	// // TODO Auto-generated constructor stub
	// }

	void draw() {
		for (int i = 1; i < height; i += 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}

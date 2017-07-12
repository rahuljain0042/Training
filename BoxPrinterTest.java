public class BoxPrinterTest {
	public static void main(String args[]) {
		BoxPrinter<Integer, Integer> value1 = new BoxPrinter<Integer, Integer>(new Integer(10), new Integer(10));
		System.out.println(value1);

		BoxPrinter<String, String> value2 = new BoxPrinter("Hello world", "Whats up!!");
		System.out.println(value2);

		Car c = new Car("R8", " white", "Audi");
		Car d = new Car("R8", " black", "Audi");

		BoxPrinter<Car, Car> value3 = new BoxPrinter<Car, Car>(c, d);
		System.out.println(value3);
	}
}

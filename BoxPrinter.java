
public class BoxPrinter<T, Q> {
	private T val;
	private Q val1;

	public BoxPrinter(T arg, Q arg1) {
		val = arg;
		val1 = arg1;
	}

	public String toString() {
		return "[" + val + " " + val1 + "]";

	}
}

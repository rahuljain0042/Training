
import java.util.Comparator;

@SuppressWarnings("rawtypes")
class Modelcomparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Car a = (Car) o1;
		Car b = (Car) o2;

		return a.getModel().compareTo(b.getModel());
	}
}

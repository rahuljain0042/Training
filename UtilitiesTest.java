import java.util.ArrayList;
import java.util.List;

class Utilities{
	public static <T> void fill(List<T> list, T val){
		for(int i = 0; i< list.size(); i++)
			list.set(i, val);
	}
}
public class UtilitiesTest {
public static void main(String args[]){
	List<Integer> intList = new ArrayList<Integer>();
	intList.add(10);
	intList.add(20);
	System.out.println("The original list list is:" +intList);
	Utilities.fill(intList, 100);
		System.out.println("the list after calling utilities.fill is:" +intList);
}
}

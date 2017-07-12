import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TestCollections {
	public static void main(String args[]){  
		  Set<Car> arayList = new HashSet<Car>();
		  Car c = new Car("A1","red","Audi");
		  arayList.add(new Car("A4","white","audi")); 
		  arayList.add(new Car("A3","grey","audi"));
		  arayList.add(new Car("A6","red","audi"));
		  arayList.add(new Car("A6","red","audi"));
		  //arayList.add(2,new Car("A8","white","audi"));
		  arayList.add(c);
		  arayList.add(c);
//          Collections.sort(arayList,new Comparator<Car>()
//         {
//        	  public int compare(Car arg0, Car arg1){
//        		  return arg0.getModel().compareTo(arg1.getModel());
//        	  }
//          });
		  for(Car car:arayList){

 System.out.println("Model " + car.getModel()+ " color "+ car.getColor() + " company " + car.getCompany());
		  }


		// System.out.println(arayList);

	}
}
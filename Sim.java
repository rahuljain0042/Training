import javax.swing.plaf.synth.SynthSeparatorUI;

public class Sim {
	
	public static void main(String args[]) {
		Car c1 = new Car("A24", "Red", "Audi");
		Car c2 = new Car("A5", "Red", "Audi");		
		Modelcomparator modelcomparator = new Modelcomparator();
		System.out.println(modelcomparator.compare(c1, c2));
	}
}

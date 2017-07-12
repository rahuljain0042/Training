
	public class Persan {
		 Persan(String s, int i) {
		 ++pid;
		 name = s;
		 age = i;
		 }

		static int pid;
		 int age;
		 String name;
		}

		class Test {
		 public static void main(String args[]) {
		 Persan p1 = new Persan("John", 22);
		 Test te = new Test();
		 Persan p2 = te.change(p1);
		 System.out.println(p2.pid + " " + p2.name + " " + p2.age);
		 System.out.print(p1.pid + " " + p1.name + " " + p1.age);
		 }

		private Persan change(Object o) {
		 Persan p2 = (Persan) o;
		 p2.age = 25;
		 return p2;
		 }
		}

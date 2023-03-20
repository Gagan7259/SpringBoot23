package innerclsmodifies;

abstract class staticm {
	abstract void display();
}

class Dis extends staticm {

	public  void display() {
		// TODO Auto-generated method stub
		System.out.println("ok ok");
	}

	public static void main(String[] args) {
		Dis d= new Dis();
		d.display();
	}
}
//abstract vs final
// vs static
//vs synchrronized\
//vs strict     ITS ALWAYS ILLEGAL COMBINATION MODIFIES
package innerclsmodifies;

abstract class Test1 {
	abstract void display();
}

class Display1 extends Test1 {

	@Override
	public void display() {
		System.out.println("Stop");
	}

	public static void main(String[] args) {
		Display1 d = new Display1();
		d.display();
	}
}

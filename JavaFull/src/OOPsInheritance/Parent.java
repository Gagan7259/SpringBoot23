package OOPsInheritance;

public class Parent {
	void display1() {
		System.out.println("Hello world");
	}
}

class Child extends Parent {
	void Display2() {
		System.out.println("Ha hello");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		p.display1();

		Child c = new Child();
		c.display1();
		c.Display2();

		Parent p1 = new Child();
		p1.display1();

	}
}
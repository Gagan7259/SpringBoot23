package Intrface;

interface One {
	void m1();

	void m2();
}

class Child implements One {

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hi its m1 Method");
	}

	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Hi its m2 Method");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
	}
}
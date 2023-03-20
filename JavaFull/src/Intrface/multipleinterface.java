package Intrface;

interface multipleinterface {
	void m1();
}

interface multi2 {
	void m2();
}
//A class can exttend no of interfaces

class Two implements multi2, multipleinterface {

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Pora rey");
	}

	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("A pota ley");
	}

	public static void main(String[] args) {
		Two t = new Two();
		t.m1();
		t.m2();
	}
}

package opps2;

public class method {
	public void m1(int i) {
		System.out.println("M1() int method");
	}

	public int m1(float f) {
		System.out.println("m1() float method");
		return 10;
	}

	public static void main(String[] args) {
		method m = new method();
		m.m1(100);
		m.m1(29.0f);

	}
}

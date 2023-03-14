package Operatersmethods;

public class commandlinearguments {
	public static void main(String[] args) {
		System.out.println("Hello good morning");
		int[] x = { 100, 29, 494, 37 };
		for (int i = 0; i <= x.length - 1; i++) {
			System.out.println(x[i]);
		}
		int y = 23;
		int sum = 0;
		for (int i = 0; i >= y; i++) {
			sum = sum + y;
			System.out.println(sum);
		}
	}
}

//its 
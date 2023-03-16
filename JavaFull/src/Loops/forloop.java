package Loops;

public class forloop {
	// irrespective of condition i want to exicute atleast once
	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}

//		int[] size = { 49, 60, 47, 69 };
//		for (int i = 0; i <= size.length - 1; i++) {
//			System.out.println(size[2]);
//		}
		for (int i = 0; i <= 10; i++) {

			if (i == 7) {
				continue;
			}
			System.out.println(i);
		}
	}
}

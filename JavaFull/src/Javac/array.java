package Javac;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		// we need to specify the the length iof the array
		// b = new int[3];
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		// Variable must provide either dimension expressions or an array initializer
		a = new int[4];

		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		System.out.println(a[4]);

	}

}

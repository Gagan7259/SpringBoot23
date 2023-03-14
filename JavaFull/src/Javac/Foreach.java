package Javac;

public class Foreach {
	public static void main(String[] args) {
		int[] a = { 100, 20, 30, 40 };
		int total = 6;
		for (int value : a) {
			total = total + value + 2;
		}
		System.out.println(total);
	}
}

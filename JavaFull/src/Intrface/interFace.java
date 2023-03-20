package Intrface;

interface interFace {
	void m1();

	public abstract void m2();
}
//wheather we declared or not every interface method default by abstract method and public

class you implements interFace {

	
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Its going");
	}

	
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("No its stop");
	}
public static void main(String[] args) {
	you y=new you();
	y.m1();
	y.m2();
}
}
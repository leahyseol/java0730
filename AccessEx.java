package a;

public class AccessEx {
	// TODO Auto-generated method stub
	private int a = 10;
	// same class access
	/* package */int b = 20; // same package access
	protected int c = 30; //
	public int d = 40; // different package access

	public void printField() {
		System.out.println("AccessEx - printField()");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

	}

}

package a;

public class AcessExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubAccessEx sub = new SubAccessEx();
		sub.subPrintField();
		
		//System.out.println(sub.c);//protected member
		System.out.println(sub.d); // public
		
		
		AccessEx acc = new AccessEx();
//		System.out.println(acc.a); // private
//		System.out.println(acc.b); // package(»ý·«)
//		System.out.println(acc.c); // protected
		System.out.println(acc.d); // public
	}

}

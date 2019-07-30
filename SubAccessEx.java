package a;

	import a.AccessEx;

	public class SubAccessEx extends AccessEx {

		void subPrintField() {
			System.out.println("SubAccessEx - subPrintField()");
			System.out.println("a = " + a); // 접근지정자 private
			System.out.println("b = " + b); // 접근지정자 생략(package)
		
		
	}

}

package a;

	import a.AccessEx;

	public class SubAccessEx extends AccessEx {

		void subPrintField() {
			System.out.println("SubAccessEx - subPrintField()");
			System.out.println("a = " + a); // ���������� private
			System.out.println("b = " + b); // ���������� ����(package)
		
		
	}

}

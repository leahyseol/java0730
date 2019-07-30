package com.exam;

class Point2D {
	int x;
	int y;

	Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println(x + ", " + y);
	}
}

class Point3D extends Point2D {
	int z;
	
	Point3D(){
		super(1,2);
		x=1;
		y=2;
		z=3;
	}
	
	Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}

	@Override
	void print() {
		super.print();
		System.out.println(","+z);
	}

}

public class Ex4 {

	public static void main(String[] args) {
		Point3D point3d = new Point3D();
		point3d.print();
		System.out.println();
		
		Point3D p2 = new Point3D(10, 20, 30);
		p2.print();
	}

}

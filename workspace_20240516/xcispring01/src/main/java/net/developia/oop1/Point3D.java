package net.developia.oop1;

//객체 지향의 특징 2 - 상속
public class Point3D extends Point2D{ 
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//객체 지향의 특징 3 - 다형성
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("z = " + this.getZ());
	}
}

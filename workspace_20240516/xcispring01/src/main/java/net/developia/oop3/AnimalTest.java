package net.developia.oop3;

public class AnimalTest {
	
	public static void main(String[] args) {
//		Animal a = new Animal();
//		System.out.println(a);
//		
//		if( a instanceof Bird) {
//			Bird b = (Bird) a;
//			System.out.println(b);
//		} else {
//			System.out.println("다운캐스팅 불가");
//		}
		
		Bird b = new Bird();
		
		// 원래! 새인데 동물임을 가리키게끔 만들었다.
		// 그럼 다시 새라고 가리킬 수 있을까? -> Yes
		if(b instanceof Animal) {
			Animal a = b;  // 업캐스팅
			
			if(a instanceof Bird) {
				Bird b2 = (Bird)a; // 다운 캐스팅 
				System.out.println(a);
				
				if(b2 instanceof Condor) {
					Condor c = (Condor) b2;
					System.out.println(c);
				} else 
					System.out.println("err3");
			}
			else 
				System.out.println("err2");
		} 
		else 
			System.out.println("err1");
		

		
	}
}


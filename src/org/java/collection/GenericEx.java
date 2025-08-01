package org.java.collection;

class G1 {
	int a;
	int m1(int a) {
		int b = a;
		System.out.println(b);
		return b;
	}
}

class G2 {
	String a;
	String m2(String a) {
		String b = a;
		System.out.println(b);
		return b;
	}
}
class G3<T>{
	T a;
	T m3(T a) {
		T b=a;
		System.out.println(b);
		return b;
	}
}

public class GenericEx {

	public static void main(String[] args) {
		
		// 객체를 생성 할 때 -> 타입을 선택
		// 컬렉션 프레임워크
		G3<String> g3= new G3<String>();
		g3.a="300";
		String a3=g3.a;
		String b3= g3.m3("300");
		System.out.println(a3);
		System.out.println(b3);

		System.out.println();
		
		G3<Integer> g4= new G3<Integer>();
		g4.a=new Integer(10);
		int a4=g4.a=100;// 자동박싱
//		Integer b4=g4.a;
//		int b4=g4.a.intValue();
		int b4=g4.a;// 자동언박싱
		System.out.println(a4);
		System.out.println(b4);
		
		System.out.println();
		
		G1 g1 = new G1();
		g1.a = 100;
		int a1 = g1.a;
		int b1 = g1.m1(200);

		System.out.println(a1);
		System.out.println(b1);

		System.out.println();

		G2 g2 = new G2();
		g2.a = "100";
		String a2 = g2.a;
		String b2 = g2.m2("200");

		System.out.println(a2);
		System.out.println(b2);

	}
}

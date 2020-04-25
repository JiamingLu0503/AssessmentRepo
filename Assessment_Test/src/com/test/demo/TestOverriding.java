package com.test.demo;

class Test {

	void tests() {

		System.out.println("Test class : tests");

	}

}

class Fest extends Test {

	static void tests() {

		System.out.println("Fest class : tests");

	}

}

class Super {

	public static void tests() {

		System.out.println("Super static");

	}

}

class Sub extends Super {

	public static void tests() {

		System.out.println("Sub static");

	}

}

class MyClass {

	void add(int i, int ti) {

		// I will do later

	}

}

class MySubclass extends MyClass {

	public void add(int i, int ti) {

		System.out.println(i + ti);

	}

}

public class TestOverriding {

	public static void main(String aga[]) {

		// Q3
		Test t = new Fest();
		t.tests();

		// Q4
		Super superRef = new Sub();
		Sub subRef = new Sub();
		Super suRef = new Super();
		superRef.tests();
		subRef.tests();
		suRef.tests();
		
		// Q5
		MyClass mc = new MySubclass();
		mc.add(1, 2);

	}

}

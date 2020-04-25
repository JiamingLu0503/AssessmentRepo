package com.test.demo;

public class Strings {

	private static String STATIC = "working";

	private String a = null;

	public static void main(String ads[]) {

		// Q1
		String a = "working";

		Strings st = new Strings();

		st.a = "working";

		System.out.println(Strings.STATIC == a);
		System.out.println(Strings.STATIC == st.a);

		// Q2
		String arr[] = { "meow", "bray", "moo" };
		
		String another = "meow";

		System.out.println(arr[0] == another);

	}

}

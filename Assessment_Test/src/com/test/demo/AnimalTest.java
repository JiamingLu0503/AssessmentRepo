package com.test.demo;

import java.util.HashSet;

class Animal {

	public int i = 12;

	public Animal() {

		i = 13;

	}

	public String toString() {

		return "Animal" + i;

	}

}

public class AnimalTest {
	public static void main(String[] args) throws Exception {
		// Q7
		HashSet<Animal> s = new HashSet<Animal>();

		s.add(new Animal());

		s.add(new Animal());

		for (Animal a : s) {

			System.out.println(a);

		}

	}
}

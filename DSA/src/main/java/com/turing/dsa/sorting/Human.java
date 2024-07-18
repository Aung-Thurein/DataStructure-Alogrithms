package com.turing.dsa.sorting;

import java.util.Comparator;

public class Human implements Comparable<Human> {

	String name;
	int age;

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Human another) {
		return this.age - another.age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

		
	
}

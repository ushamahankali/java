package com.ektha.compare.sort;

import java.util.Comparator;

class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class Student {
	String name;
	int no;

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", no=" + no + '}';
	}
}
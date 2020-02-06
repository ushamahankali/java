package com.ektha.compare.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String args[]) {
		Sorting sor = new Sorting();
		sor.sortStudentInArrayList();

	}

	private Student createStudent(String name, int no) {
		Student student = new Student();
		student.setName(name);
		student.setNo(no);
		return student;
	}

	private void sortStudentInArrayList() {
		List<Student> students = new ArrayList<>();
		Student student1 = createStudent("Biplab", 3);
		students.add(student1);
		Student student2 = createStudent("John", 1);
		students.add(student2);
		Student student3 = createStudent("Pal", 5);
		students.add(student3);
		Student student4 = createStudent("Biplab", 2);
		students.add(student4);
		System.out.println("Original students list: " + students);
		Collections.sort(students, new NameComparator());
		System.out.println("Sorted students list: " + students);
	}
}
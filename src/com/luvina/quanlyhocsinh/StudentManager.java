package com.luvina.quanlyhocsinh;

import java.util.ArrayList;

public class StudentManager {
	// khai bao thuoc tinh
	private Student[] students;
	// khoi tao thuoc tinh
	Student sd1 = new Student("LP12.01", "Nguyen Van Sinh", 100);
	//students[0] = new Student("LP12.01", "Nguyen Van Sinh", 100);
	Student sd2 = new Student("LP12.02", "Tran The Bon", 80);
	Student sd3 = new Student("LP12.03", "Le Trung Duc", 90);
	Student sd4 = new Student("LP12.04", "Nguyen Thi Huyen", 100);
	Student sd5 = new Student("LP12.05", "Nguyen Van Dong", 100);

	// phuong thuc
	
	// phuong thuc khoi tao
	public StudentManager() {
		Student[] students = { sd1, sd2, sd3, sd4, sd5 };
		this.students = students;
	}

	public Student[] getStudents() {
		return students;
	}

	// in thong hoc sinh
	public void printList() {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	// phuong thuc findStudentByScore
	public Student[] findStudentByScore(int score) {
		ArrayList<Student> result = new ArrayList<>();
		// Student[] result = new Student[students.length];
		int k = 0; // biến đếm phần tử cho mảng result
		for (Student sd : students) {
			if (sd.getScore() == score) {
				result.add(sd);
				k++;
//				result[k++] = sd;
			}
		}
		Student[] st = result.toArray(new Student[result.size()]);
		

		return st;
	}
	
}

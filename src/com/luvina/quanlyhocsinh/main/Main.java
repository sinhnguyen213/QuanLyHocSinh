package com.luvina.quanlyhocsinh.main;

import java.util.Arrays;

import com.luvina.quanlyhocsinh.Student;
import com.luvina.quanlyhocsinh.StudentManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("20143779", "Nguyen Van Sinh", 100);
		System.out.println(st);
//		String info = st.toString();
//		System.out.println(info);
		StudentManager sm = new StudentManager();
		//sm.printList();
		System.out.println();
		Student[] results = sm.findStudentByScore(100);
		for(Student sd:results) {
			System.out.println(sd);
		}
		Arrays.sort(sm.getStudents());
		System.out.println(Arrays.toString(sm.getStudents()));
	}
}

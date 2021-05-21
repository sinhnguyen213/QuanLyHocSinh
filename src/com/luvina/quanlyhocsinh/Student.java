package com.luvina.quanlyhocsinh;

//import com.luvina.quanlyhocsinh.main.Comparator;

public class Student implements Comparable<Student> {
	// khai bao thuoc tinh cho studen
	private String id;
	private String name;
	private int score;

	// khai bao phuong thuc
	// phuong thuc khoi tao
	public Student(String id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	// override toString
	public String toString() {
		String info = id + "_" + name + "_" + score;
		return info;
	}
	
	@Override
	public int compareTo(Student o) {
		//thực hiện so sánh giữa chính bản thân với đối tượng hiện tại (dt1) bới dt2
		//trả về kết quả so sánh:
		//-Nếu dt hiện tại (dt1)> dt2 thì kết quả đại diện trả về phải là 1 số nguyên dương
		//-Nếu dt1<dt2 thid kết quả đại diện trả về là 1 số nguyên âm
		//-Nếu dt1=dt2 thid kết quả trả về phải là 0
		//==> Đây là tiêu chí so sánh tăng dầns
		/*
		 * if(this.score-o.score>0) { return 1; }else if(this.score - o.score==0) {
		 * return 0; }else { return -1; }
		 */
		return this.score - o.score;
	}
	

	// cac phuong thuoc get thuoc tinh

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}

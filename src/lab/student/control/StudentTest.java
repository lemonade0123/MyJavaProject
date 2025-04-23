package lab.student.control;

import lab.student.entity.*;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("1234", "±è¹Î¼ö", "ÄÄÇ»ÅÍ°øÇĞ", 3);
		
		System.out.println(student.getStudentid() + "/" + student.getName() + "/" + student.getMajor() 
									+ "/" + student.getGrade() + "ÇĞ³â");
		
		student.setGrade(5);
	}

}

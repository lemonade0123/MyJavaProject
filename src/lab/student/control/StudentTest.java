package lab.student.control;

import lab.student.entity.*;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("1234", "��μ�", "��ǻ�Ͱ���", 3);
		
		System.out.println(student.getStudentid() + "/" + student.getName() + "/" + student.getMajor() 
									+ "/" + student.getGrade() + "�г�");
		
		student.setGrade(5);
	}

}

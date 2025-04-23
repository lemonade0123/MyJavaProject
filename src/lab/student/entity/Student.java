package lab.student.entity;

public class Student {
	private String studentid;
	private String name;
	private String major;
	private int grade;
	
	public Student(String studentid, String name, String major, int grade) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.major = major;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
		System.out.println(grade + "�г����� ����");
		if (grade > 4 ) {
			System.out.println("�г��� 1~4 ���̿��� �մϴ�.");
		}
	}

	public String getStudentid() {
		return studentid;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}
	
	

}

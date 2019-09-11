package org.college;

class student{
	public void studentName() {
		System.out.println("Studentname:Tamil");
		
	}
	public void studentDept() {
		System.out.println("StudentDept:ECE");
		
	}
	public void studentId() {
		System.out.println("StuId:546");
		
	}
}
class hostel {
	public void hostelName() {
		System.out.println("Hostelname:Boys hostel");
		
	}
}
class dept {
	public void deptName() {
		System.out.println("Deptname:violet");
		
	}
}
public class college {
	public void collegeName() {
		System.out.println("collegename:MNM");
		
	}
	public void collegeCode() {
		System.out.println("collegecode:116");
		
	}
	public void collegeRank() {
		System.out.println("collegerank:10");
		
	}
	public static void main(String[] args) {
		college c=new college();
		student s=new student();
		hostel h=new hostel();
		dept d=new dept();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		s.studentName();
		s.studentDept();
		s.studentId();
		h.hostelName();
		d.deptName();
		
	}
}
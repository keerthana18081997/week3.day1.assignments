package org.student;

import org.department.Department;

public class Student extends Department {
public void studentId() {
	System.out.println("id");
}
public void studentdept() {
	System.out.println("information technology");
}
public void studentName() {
	System.out.println("keerthana");
}
public static void main(String[] args) {
	Student obj = new Student();
	obj.collagecode();
	obj.collagename();
	obj.collagerank();
	obj.deptName();
	obj.studentId();
	obj.studentdept();
	obj.studentName();
}
}

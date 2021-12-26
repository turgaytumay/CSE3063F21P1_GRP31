package iteration2.project;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	private String studentID;
	private String studentName;
	private int grade;
	private float gpa;
	private LinkedHashMap<Course, String> takenCourses;
	private ArrayList<Course> requestedCourses;

	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	
	public int getCompletedCredit() {
		int completedCredit = 0;
		for(Course course: takenCourses.keySet()) {
			if (takenCourses.get(course).equals("FF") || takenCourses.get(course).equals("FD")) continue;
			completedCredit += course.getCredit();
		}
		return completedCredit;
	}

	
	
	// getter - setter

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public float getGPA() {
		return gpa;
	}

	public void setGPA(float GPA) {
		GPA = gpa;
	}

	public LinkedHashMap<Course, String> getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(Course takenCourse, String letterGrade) {
		if (this.takenCourses == null)
			this.takenCourses = new LinkedHashMap<Course, String>();
		this.takenCourses.put(takenCourse, letterGrade);
	}

	public ArrayList<Course> getRequestedCourses() {
		return requestedCourses;
	}

	public void setRequestedCourses(Course requestedCourse) {
		if (this.requestedCourses == null)
			this.requestedCourses = new ArrayList<Course>();
		this.requestedCourses.add(requestedCourse);
	}

	public ArrayList<Course> getFailedCourses() {
		ArrayList<Course> temp = new ArrayList<Course>();
		if (this.takenCourses != null) {
			for (Course course : takenCourses.keySet()) {
				if (takenCourses.get(course).equals("FF") || takenCourses.get(course).equals("--")
						|| takenCourses.get(course).equals("FD")) {
					temp.add(course);
				}

			}
		}

		return temp;

	}

}

package com.donhamiltoniii.wcciinternalstudentapp.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cohort {

	private Long id;
	private String language;
	
	private Map<Long, Student> students;

	public Long getId() {
		return id;
	}

	public String getLanguage() {
		return language;
	}

	public Map<Long, Student> getStudents() {
		return students;
	}

	public Cohort(Long id, String language, Student... students) {
		this.id = id;
		this.language = language;
		this.students = new HashMap<>();
		for (Student student : students) {
			this.addStudent(student);
		}
	}

	public void addStudent(Student student) {
		this.students.put(student.getId(), student);
	}
	
	public Collection<Student> getStudentsCollection() {
		return this.students.values();
	}

	@Override
	public String toString() {
		return "Cohort [id=" + id + ", language=" + language + "]";
	}

}

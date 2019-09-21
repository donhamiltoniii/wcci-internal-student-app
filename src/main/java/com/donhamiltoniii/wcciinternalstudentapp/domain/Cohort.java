package com.donhamiltoniii.wcciinternalstudentapp.domain;

public class Cohort {

	private Long id;
	private String language;

	public Long getId() {
		return id;
	}

	public String getLanguage() {
		return language;
	}

	public Cohort(Long id, String language) {
		this.id = id;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Cohort [id=" + id + ", language=" + language + "]";
	}

}

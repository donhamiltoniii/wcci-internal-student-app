package com.donhamiltoniii.wcciinternalstudentapp.repository;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.donhamiltoniii.wcciinternalstudentapp.domain.Cohort;
import com.donhamiltoniii.wcciinternalstudentapp.domain.Student;

@Repository
public class CohortRepository {
	
	private Map<Long, Cohort> cohorts;

	public CohortRepository(Map<Long, Cohort> cohort) {
		this.cohorts = cohort;
		this.populate();
	}

	private void populate() {
		Student studentOne = new Student(1L, "John", "Doe");
		Student studentTwo = new Student(2L, "Jane", "Doe");
		Student studentThree = new Student(3L, "Jason", "Doe");
		Student studentFour = new Student(4L, "Jeff", "Doe");
		Student studentFive = new Student(5L, "Julie", "Doe");
		
		this.save(new Cohort(1L, "Java", studentTwo, studentFive));
		this.save(new Cohort(2L, "JavaScript", studentOne, studentThree, studentFive));
		this.save(new Cohort(3L, "Haskell", studentFour, studentOne));
	}
	
	public Collection<Cohort> findAll() {
		return cohorts.values();
	}
	
	public void save(Cohort cohort) {
		this.cohorts.put(cohort.getId(), cohort);
	}

	public Cohort findById(Long id) {
		return this.cohorts.get(id);
	}
	
}

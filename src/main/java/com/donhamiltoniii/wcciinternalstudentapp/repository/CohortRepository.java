package com.donhamiltoniii.wcciinternalstudentapp.repository;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.donhamiltoniii.wcciinternalstudentapp.domain.Cohort;

@Repository
public class CohortRepository {
	
	private Map<Long, Cohort> cohorts;

	public CohortRepository(Map<Long, Cohort> cohort) {
		this.cohorts = cohort;
		this.populate();
	}

	private void populate() {
		this.save(new Cohort(1L, "Java"));
		this.save(new Cohort(2L, "JavaScript"));
		this.save(new Cohort(3L, "Haskell"));
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

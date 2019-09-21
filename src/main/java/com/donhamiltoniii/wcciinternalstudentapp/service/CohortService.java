package com.donhamiltoniii.wcciinternalstudentapp.service;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.donhamiltoniii.wcciinternalstudentapp.domain.Cohort;
import com.donhamiltoniii.wcciinternalstudentapp.repository.CohortRepository;

@Service
public class CohortService {
	
	private CohortRepository cohortRepo;
	
	public CohortService() {
		this.cohortRepo = new CohortRepository(new HashMap<>());
	}

	public Collection<Cohort> getCohorts() {
		return this.cohortRepo.findAll();
	}

	public Cohort getCohort(Long id) {
		return this.cohortRepo.findById(id);
	}
}

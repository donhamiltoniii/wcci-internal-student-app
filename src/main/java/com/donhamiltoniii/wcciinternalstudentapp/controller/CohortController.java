package com.donhamiltoniii.wcciinternalstudentapp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donhamiltoniii.wcciinternalstudentapp.service.CohortService;

@Controller
@RequestMapping("/cohorts")
public class CohortController {
	
	@Resource
	private CohortService data;

	@GetMapping("")
	public String getCohorts(Model model) {
		model.addAttribute("cohorts", this.data.getCohorts());
		return "cohorts";
	}
	
	@GetMapping("/{id}")
	public String getCohort(@PathVariable Long id, Model model) {
		model.addAttribute("cohort", this.data.getCohort(id));
		return "cohort";
	}
}

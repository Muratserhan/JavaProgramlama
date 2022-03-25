package com.etiya.rentACar.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.rentACar.business.abstracts.StateService;
import com.etiya.rentACar.business.requests.stateRequests.CreateStateRequest;
import com.etiya.rentACar.business.responses.stateResponses.ListStateDto;

@RestController
@RequestMapping("/api/states")
public class StatesController {
	private StateService stateService;

	public StatesController(StateService stateService) {
		this.stateService = stateService;
	}

	@GetMapping("/getAll")
	public List<ListStateDto> getAll() {
		return stateService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestParam CreateStateRequest createStateRequest) {
		this.stateService.add(createStateRequest);
	}

}

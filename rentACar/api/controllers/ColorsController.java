package com.etiya.rentACar.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.etiya.rentACar.business.abstracts.ColorService;
import com.etiya.rentACar.business.requests.colorRequests.CreateColorRequest;

@RestController
@RequestMapping("/api/colors")

public class ColorsController {
	private ColorService colorService;

	public ColorsController(ColorService colorService) {
		this.colorService = colorService;

	}

	@PostMapping("/add")
	public void add(@RequestBody CreateColorRequest createColorRequest) {
		this.colorService.add(createColorRequest);
	}
}

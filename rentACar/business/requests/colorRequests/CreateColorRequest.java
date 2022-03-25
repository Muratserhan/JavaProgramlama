package com.etiya.rentACar.business.requests.colorRequests;

import com.etiya.rentACar.business.requests.colorRequests.CreateColorRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateColorRequest {
	private String colorName;
}

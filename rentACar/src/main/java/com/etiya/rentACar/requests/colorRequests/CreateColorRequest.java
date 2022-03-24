package com.etiya.rentACar.requests.colorRequests;

import com.etiya.rentACar.requests.colorRequests.CreateColorRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateColorRequest {
	private String colorName;
}

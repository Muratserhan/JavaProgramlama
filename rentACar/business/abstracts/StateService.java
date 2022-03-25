package com.etiya.rentACar.business.abstracts;

import java.util.List;

import com.etiya.rentACar.business.requests.stateRequests.CreateStateRequest;
import com.etiya.rentACar.business.responses.stateResponses.ListStateDto;

public interface StateService {
	void add(CreateStateRequest createStateRequest);

	List<ListStateDto> getAll();
}

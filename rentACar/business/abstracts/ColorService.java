package com.etiya.rentACar.business.abstracts;

import java.util.List;

import com.etiya.rentACar.business.responses.colorResponses.ListColorDto;
import com.etiya.rentACar.business.requests.colorRequests.CreateColorRequest;

public interface ColorService {
	void add(CreateColorRequest createColorRequest);

	List<ListColorDto> getAll();
}

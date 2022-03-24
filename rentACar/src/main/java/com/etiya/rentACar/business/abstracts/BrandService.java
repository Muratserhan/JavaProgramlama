package com.etiya.rentACar.business.abstracts;

import java.util.List;

import com.etiya.rentACar.business.responses.brandResponses.ListBrandDto;
import com.etiya.rentACar.requests.brandRequests.CreateBrandRequest;

public interface BrandService {
	void add(CreateBrandRequest createBrandRequest);
	List<ListBrandDto> getAll();
}

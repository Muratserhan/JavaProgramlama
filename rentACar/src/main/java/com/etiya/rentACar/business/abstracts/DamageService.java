package com.etiya.rentACar.business.abstracts;

import java.util.List;

import com.etiya.rentACar.business.responses.damageResponses.ListDamageDto;
import com.etiya.rentACar.requests.damageRequests.CreateDamageRequest;

public interface DamageService {
	void add(CreateDamageRequest createDamageRequest);

	List<ListDamageDto> getAll();

	List<ListDamageDto> getByCarId(int id);

	List<ListDamageDto> getAllPaged(int pageNo, int pageSize);

	List<ListDamageDto> getAllSorted(String option, String field);
}

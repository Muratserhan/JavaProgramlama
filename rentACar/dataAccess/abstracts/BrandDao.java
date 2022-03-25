package com.etiya.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etiya.rentACar.business.responses.brandResponses.ListBrandDto;
import com.etiya.rentACar.entities.Brand;

@Repository
public interface BrandDao extends JpaRepository<Brand, Integer> {
	List<ListBrandDto> getByName(String name);

	boolean existsBrandByName(String name);
}

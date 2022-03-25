package com.etiya.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.rentACar.entities.State;

public interface StateDao extends JpaRepository<State, Integer> {

}

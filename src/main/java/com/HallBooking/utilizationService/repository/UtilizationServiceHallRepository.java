package com.HallBooking.utilizationService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HallBooking.common.Entity.HallInformation;

public interface UtilizationServiceHallRepository extends CrudRepository<HallInformation, Integer>{

}

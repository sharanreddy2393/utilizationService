package com.HallBooking.utilizationService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.HallBooking.common.Entity.HallInformation;

public interface UtilizationServiceHallRepository extends CrudRepository<HallInformation, Integer>{
	
	@Query("SELECT h FROM HallInformation h WHERE  h.muncipalRegistration	= :muncipalRegistration")
	public Optional<HallInformation> GetHallInformationByMuncipal(@Param("muncipalRegistration") String muncipalRegistration);

}

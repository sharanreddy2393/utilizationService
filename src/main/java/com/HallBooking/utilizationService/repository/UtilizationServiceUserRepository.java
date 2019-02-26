package com.HallBooking.utilizationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HallBooking.common.Entity.UserInfromation;
@Repository
public interface UtilizationServiceUserRepository extends JpaRepository<UserInfromation, Integer> {
	
}

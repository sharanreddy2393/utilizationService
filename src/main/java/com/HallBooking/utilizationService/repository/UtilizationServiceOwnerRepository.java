package com.HallBooking.utilizationService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.HallBooking.common.Entity.OwnerInformation;

@Repository
public interface UtilizationServiceOwnerRepository extends JpaRepository<OwnerInformation, Integer> {

	@Query("SELECT o FROM OwnerInformation o WHERE  o.email	= :email OR"
			+ " o.phoneNumber =:phoneNum or o.adharNumber=:adhar")
	public Optional<OwnerInformation> GetOwnerInformation(@Param("email") String email,
			@Param("phoneNum") String phonenumber, @Param("adhar") String adharNumber);
}

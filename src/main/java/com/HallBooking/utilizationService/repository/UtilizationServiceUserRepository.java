package com.HallBooking.utilizationService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.HallBooking.common.Entity.UserInfromation;

@Repository
public interface UtilizationServiceUserRepository extends JpaRepository<UserInfromation, Integer> {

	@Query("SELECT u FROM UserInfromation u WHERE  u.email	= :email OR u.phoneNumber =:phoneNum")
	public Optional<UserInfromation> GetUserInformationByEmail(@Param("email") String email,
			@Param("phoneNum") String phoneNum);

}

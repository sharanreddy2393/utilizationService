package com.HallBooking.utilizationService.dao;


import java.util.List;
import java.util.Optional;

import com.HallBooking.common.Entity.HallInformation;
import com.HallBooking.common.Entity.UserInfromation;

public interface UtilizationServiceDao {

	public Optional<UserInfromation> GetUserInformationById(Integer id);
	public List<UserInfromation> GetAllUserInfor();
	public Optional<HallInformation> GetHallInformationById(int hallId);
}

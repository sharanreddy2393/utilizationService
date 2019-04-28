package com.HallBooking.utilizationService.services;


import java.util.List;
import java.util.Optional;

import com.HallBooking.common.Entity.HallInformation;
import com.HallBooking.common.Entity.OwnerInformation;
import com.HallBooking.common.Entity.UserInfromation;


public interface UtilizationService {

	public List<UserInfromation> GetAllUserInformation();
	public Optional<UserInfromation> GetUserInformationById(int uid);
	public Optional<HallInformation> GetHallInformationById(int hallId);
	public Optional<UserInfromation> GetUserInformationByEmail(String email, String phoneNum);
	public Optional<HallInformation> GetHallInfoByMuncipal(String muncipalNum);
	public Optional<OwnerInformation> GetOwnerInformation(String adhar, String email, String phonenumber);
}

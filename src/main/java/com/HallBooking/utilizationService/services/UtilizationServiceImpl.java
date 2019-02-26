package com.HallBooking.utilizationService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.HallBooking.common.Entity.HallInformation;
import com.HallBooking.common.Entity.UserInfromation;
import com.HallBooking.utilizationService.dao.UtilizationServiceDaoImpl;
import com.HallBooking.utilizationService.dao.UtilizationServiceDaoImpl;

@Service
@Transactional
public class UtilizationServiceImpl implements UtilizationService{

	@Autowired
	UtilizationServiceDaoImpl utilizationDao;
	
	@Override
	public List<UserInfromation> GetAllUserInformation() {
		return utilizationDao.GetAllUserInfor();
	}

	@Override
	public Optional<UserInfromation> GetUserInformationById(int uid) {
		return utilizationDao.GetUserInformationById(uid);
	}

	@Override
	public Optional<HallInformation> GetHallInformationById(int hallId) {
		return utilizationDao.GetHallInformationById(hallId);
	}
	
	
}
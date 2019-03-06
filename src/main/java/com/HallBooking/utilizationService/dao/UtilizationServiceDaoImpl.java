package com.HallBooking.utilizationService.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.HallBooking.common.Entity.HallInformation;
import com.HallBooking.common.Entity.UserInfromation;
import com.HallBooking.utilizationService.repository.UtilizationServiceHallRepository;
import com.HallBooking.utilizationService.repository.UtilizationServiceUserRepository;

@Repository
@Transactional
public class UtilizationServiceDaoImpl implements UtilizationServiceDao{

	
	
	@Autowired
	 UtilizationServiceUserRepository utilizationServiceUserRepository;
	
	@Autowired
	UtilizationServiceHallRepository utilizationServiceHallRepository;

	
	public Optional<UserInfromation> GetUserInformationById(int uid) {
		return utilizationServiceUserRepository.findById(uid);
	}	

	public List<UserInfromation> GetAllUserInfor(){
		
		return utilizationServiceUserRepository.findAll();
	}

	@Override
	public Optional<HallInformation> GetHallInformationById(int hallId) {
		
		return utilizationServiceHallRepository.findById(hallId);
	}

	@Override
	public Optional<UserInfromation> GetUserInformationByEmail(String email, String phoneNum) {
		return utilizationServiceUserRepository.GetUserInformationByEmail(email,phoneNum);
	}

	@Override
	public Optional<HallInformation> GetHallInfoByMuncipal(String muncipalNum) {
		// TODO Auto-generated method stub
		return utilizationServiceHallRepository.GetHallInformationByMuncipal(muncipalNum);
	}

	
	
}

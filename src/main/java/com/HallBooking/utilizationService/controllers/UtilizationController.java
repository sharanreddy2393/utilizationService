package com.HallBooking.utilizationService.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.HallBooking.common.Entity.HallInformation;
import com.HallBooking.common.Entity.UserInfromation;
import com.HallBooking.utilizationService.services.UtilizationService;

@RestController
public class UtilizationController {

	@Autowired
	UtilizationService service;

	@RequestMapping(value = "/getallUser",method=RequestMethod.GET)
	public List<UserInfromation> GetAllUserInformation() {
		return service.GetAllUserInformation();
	}
	
	@RequestMapping(value = "/getuserbyid/{uid}",method=RequestMethod.GET)
	public Optional<UserInfromation> GetUserInfromationById(@PathVariable int uid) {
		return service.GetUserInformationById(uid);
	}
	
	@RequestMapping(value="/gethallbyid/{hallid}",method=RequestMethod.GET)
	public Optional<HallInformation> GetHallInformationById(@PathVariable int hallid ) {	
		 return service.GetHallInformationById(hallid);		
	}
	
	@RequestMapping(value="/getuserbyemail/{emailid}/{phonenum}" , method=RequestMethod.GET)
	public Optional<UserInfromation> GetUserByEmailId(@PathVariable String emailid, @PathVariable String phonenum) {
		return service.GetUserInformationByEmail(emailid,phonenum);
	}
	
	@RequestMapping(value="/getHallInfo/{muncipalnum}")
	public Optional<HallInformation> GetHallInfoByMuncipal(@PathVariable String muncipalnum) {
		return service.GetHallInfoByMuncipal(muncipalnum);
	}
}

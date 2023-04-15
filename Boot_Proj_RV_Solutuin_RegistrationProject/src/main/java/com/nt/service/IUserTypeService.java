package com.nt.service;

import java.util.Map;

import com.nt.entity.UserType;

public interface IUserTypeService {

	Long saveUserType(UserType userType);
	Map<Long,String> getTypeCodeAndUserType();
	
	
}

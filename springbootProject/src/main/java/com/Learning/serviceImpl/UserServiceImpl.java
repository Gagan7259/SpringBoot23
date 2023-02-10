package com.Learning.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Learning.Entity.Users;
import com.Learning.Repository.UserRepository;
import com.Learning.payload.UserDto;
import com.Learning.service.UserService;

@Service
class UserServiceImpl implements UserService {

	@Autowired
	 UserRepository urepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		 urepo.save(userDto);
		return null;
	}
	private Users userDtoToEntity(UserDto userDto) {
		 Users user=new Users();
		 user.setPassword(userDto.g);
		
	}

}

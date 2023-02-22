package com.kevin.shoppingcart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.shoppingcart.models.User;
import com.kevin.shoppingcart.repository.UserRepoistory;




@Service
public class UserService {
	@Autowired
	private UserRepoistory userRepo;
//	FIND ALL
	public List<User>allUser(){
		return userRepo.findAll();
	}
//	CREATE
	public User createUser(User N) {
		return userRepo.save(N);
	}
//	FIND ONE BY ID
	public User findUser(Long id) {
		Optional<User> option = userRepo.findById(id);
		if(option.isPresent()) {
			return option.get();
		}else {
			return null;
		}
	}
//	DELETE USER BY ID
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}
	
//	
		
}
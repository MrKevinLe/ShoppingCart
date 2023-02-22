package com.kevin.shoppingcart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kevin.shoppingcart.models.User;
@Repository
public interface UserRepoistory extends CrudRepository<User, Long> {
	List<User>findAll();

}

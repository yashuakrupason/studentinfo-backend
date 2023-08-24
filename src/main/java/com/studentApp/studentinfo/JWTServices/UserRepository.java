package com.studentApp.studentinfo.JWTServices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
	
	User findByUsername(String userName);

}

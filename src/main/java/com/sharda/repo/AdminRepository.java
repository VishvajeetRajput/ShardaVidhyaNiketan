package com.sharda.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sharda.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	boolean existsByAdminEmail(String email);
	
	boolean existsByPassword(String password);

}

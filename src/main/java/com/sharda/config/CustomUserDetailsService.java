package com.sharda.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sharda.entity.Admin;
import com.sharda.repo.AdminRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired 
	private AdminRepository adminRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Admin admin = adminRepository.findByAdminEmail(username).get();

        if (admin == null) {
            throw new UsernameNotFoundException("Admin not found");
        }

        return User.builder()
                .username(admin.getAdminEmail())
                .password(admin.getPassword())
                .roles("ADMIN")
                .build();
	}

}


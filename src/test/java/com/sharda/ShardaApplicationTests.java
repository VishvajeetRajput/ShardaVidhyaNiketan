package com.sharda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sharda.repo.StudentsRepository;

@SpringBootTest
class ShardaApplicationTests {
	@Autowired
	private StudentsRepository repository;
	
	@Test
	void contextLoads() {
	}

	@Test
	private void hey() {
	assertEquals(2,repository.findAll().size());
	}
	
}

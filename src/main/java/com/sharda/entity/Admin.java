package com.sharda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
<<<<<<< HEAD
@Table(name = "Admin")
=======
<<<<<<< HEAD
@Table(name = "Admin")
=======
@Table(name = "ADMIN")
>>>>>>> 25218e3 (Security changes)
>>>>>>> vishvajeet_Jadoun
public class Admin {
	
	@Id
	@Column(name = "Admin_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long adminId;
	
	@Column(name = "Admin_Email")
	private String adminEmail;
	
	@Column(name = "Password")
	private String password;
	
}

package org.springboot.springlearning.c04_data_jpa;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity(name = "account")
@NoArgsConstructor
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private int id;
	private String username;
	private String password;
	private String fullName;
	private String role;
	private boolean status;
}

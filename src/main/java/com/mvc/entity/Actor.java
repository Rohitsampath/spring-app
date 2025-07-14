package com.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JPA_ACTOR123")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Actor {
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "ACTOR_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer aid;
	@Column(length = 20)
	@NonNull
	private String aname;
	@Column(length = 30)
	@NonNull
	private String addrs;
	@NonNull
	private Double fee;
	@Column(length = 20)
	@NonNull
	private String category;
	

	
	
}

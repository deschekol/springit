package com.chekol.springit.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.micrometer.core.lang.NonNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Link {
	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private String title;
	@NonNull
	private String url;
	
	
	//comments
	
	

}

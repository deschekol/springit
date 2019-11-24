package com.chekol.springit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.micrometer.core.lang.NonNull;
import lombok.Data;
import lombok.NoArgsConstructor;

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
	@OneToMany(mappedBy = "link")
	private List<Comment> comments = new ArrayList<>();
	
	

}

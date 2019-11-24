package com.chekol.springit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.micrometer.core.lang.NonNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@RequiredArgsConstructor
@Getter @Setter
@ToString
@NoArgsConstructor
public class Link extends Auditable {



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

	public Link(String title, String url) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.url = url;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
		
	}
	
	

}

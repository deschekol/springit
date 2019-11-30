package com.chekol.springit.domain;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.URL;
import org.ocpsoft.prettytime.PrettyTime;

import com.chekol.springit.service.BeanUtil;


import io.micrometer.core.lang.NonNull;
import lombok.*;

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
	@NotEmpty(message = "Please Enter a title")
	private String title;
	@NotEmpty(message = "Please Enter a  url")
	@URL(message = "Please Enter a Valid URL")
	private String url;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	//comments
	@OneToMany(mappedBy = "link")
	private List<Comment> comments = new ArrayList<>();

	public Link(String k, String v) {
		this.title = k;
		this.url = v;
	}
	
	public Link() {}

	public void addComment(Comment comment) {
		comments.add(comment);
		
	}
	
	public String getDomainName() throws URISyntaxException {
	    URI uri = new URI(this.url);
	    String domain = uri.getHost();
	    return domain.startsWith("www.") ? domain.substring(4) : domain;
	}
	


	public String getPrettyTime() {
	    PrettyTime pt = BeanUtil.getBean(PrettyTime.class);
	    return pt.format(convertToDateViaInstant(getCreationDate()));
	}

	private Date convertToDateViaInstant(LocalDateTime dateToConvert) {
	    return java.util.Date.from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
	}
	

}

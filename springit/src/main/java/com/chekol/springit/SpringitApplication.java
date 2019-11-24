package com.chekol.springit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.chekol.springit.domain.Comment;
import com.chekol.springit.domain.Link;
import com.chekol.springit.repositary.CommentRepositary;
import com.chekol.springit.repositary.LinkRepositary;

@SpringBootApplication
public class SpringitApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}
	
	//@Bean
	CommandLineRunner runner(LinkRepositary linkRepositary, CommentRepositary commentRepositary) {
			return args -> {
				Link link = new Link("Geting Started with Spring boot 2","https://www.danvega.dev/docs/spring-boot-2-docs");
				linkRepositary.save(link);
				
				Comment comment = new Comment("This spring boot 2 link is awsome", link);
				commentRepositary.save(comment);
				link.addComment(comment);
				
				System.out.println("We Just inserted a link and a comment");				
		};
	}
	
}

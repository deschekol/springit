package com.chekol.springit.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chekol.springit.domain.Link;

public interface LinkRepositary extends JpaRepository<Link, Long> {
	
}
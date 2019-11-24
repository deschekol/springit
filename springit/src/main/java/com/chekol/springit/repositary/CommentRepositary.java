package com.chekol.springit.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chekol.springit.domain.Comment;

public interface CommentRepositary extends JpaRepository<Comment, Long> {

}

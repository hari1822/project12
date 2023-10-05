package com.comments.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.comments.insta.entity.Comments;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Integer> {

	@Query(value = "SELECT comment FROM Comments comment WHERE comment.id = :id ")
	Comments findByCommentId(@Param("id") int id);
}

package com.comments.insta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.comments.insta.entity.SubComments;

@Repository
public interface SubCommentRepository extends JpaRepository<SubComments, Integer> {

	@Query(value = "SELECT sub FROM SubComments sub WHERE sub.id = :id ")
	SubComments findBySubCommentId(@Param("id") int id);
	
	@Query(value = "SELECT sub FROM SubComments sub WHERE sub.sendId = :id")
	List<SubComments> findBySubId(@Param("id") int id);

}

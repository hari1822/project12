package com.comments.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.comments.insta.entity.Posts;

@Repository
public interface PostRepository extends JpaRepository<Posts, Short>{
    
	@Query(value = "SELECT post FROM Posts post WHERE post.id = :id ")
	Posts findByPostId(@Param("id") int id);
}

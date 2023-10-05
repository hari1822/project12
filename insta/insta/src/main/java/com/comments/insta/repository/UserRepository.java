package com.comments.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.comments.insta.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	@Query(value = "SELECT users FROM Users users WHERE users.id = :id ")
	Users findByUserId(@Param("id") int id);
}

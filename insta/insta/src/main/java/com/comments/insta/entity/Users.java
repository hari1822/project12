package com.comments.insta.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT UNSIGNED")
	private int id;
	@Column(name = "name", columnDefinition = "VARCHAR(30)")
	private String name;
	@Column(name = "status")
	private boolean status;

	@OneToMany(mappedBy = "users")
	@JsonIgnoreProperties("users")
	private List<Posts> posts;

	@OneToMany(mappedBy = "users")
	@JsonIgnoreProperties("users")
	private List<Comments> comments;

	@OneToMany(mappedBy = "users")
	@JsonIgnoreProperties("users")
	private List<SubComments> subComments;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the posts
	 */
	public List<Posts> getPosts() {
		return posts;
	}

	/**
	 * @param posts the posts to set
	 */
	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}

	/**
	 * @return the comments
	 */
	public List<Comments> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	/**
	 * @return the subComments
	 */
	public List<SubComments> getSubComments() {
		return subComments;
	}

	/**
	 * @param subComments the subComments to set
	 */
	public void setSubComments(List<SubComments> subComments) {
		this.subComments = subComments;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

}

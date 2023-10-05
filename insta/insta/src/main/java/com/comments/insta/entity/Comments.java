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
@Table(name = "comments")
public class Comments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT UNSIGNED")
	private int id;
	@Column(name = "post_id", columnDefinition = "SMALLINT UNSIGNED")
	private short postId;
	@Column(name = "comments", columnDefinition = "VARCHAR(50)")
	private String comments;
	@Column(name = "user_id", columnDefinition = "INT UNSIGNED")
	private int userId;
	@Column(name = "status")
	private boolean status;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
	@JsonIgnoreProperties("comments")
	private Users users;

	@ManyToOne
	@JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
	@JsonIgnoreProperties("comments")
	private Posts posts;

	@OneToMany(mappedBy = "comments")
	@JsonIgnoreProperties("comments")
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
	 * @return the postId
	 */
	public short getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(short postId) {
		this.postId = postId;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the users
	 */
	public Users getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

	/**
	 * @return the posts
	 */
	public Posts getPosts() {
		return posts;
	}

	/**
	 * @param posts the posts to set
	 */
	public void setPosts(Posts posts) {
		this.posts = posts;
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

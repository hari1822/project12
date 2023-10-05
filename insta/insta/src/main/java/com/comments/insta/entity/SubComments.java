package com.comments.insta.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sub_comments")
public class SubComments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT UNSIGNED")
	private int id;
	@Column(name = "comment_id", columnDefinition = "INT UNSIGNED")
	private int commentId;
	@Column(name = "comments", columnDefinition = "VARCHAR(50)")
	private String comment;
	@Column(name = "user_id", columnDefinition = "INT UNSIGNED")
	private int userId;
	@Column(name = "send_id", columnDefinition = "INT UNSIGNED")
	private int sendId;
	@Column(name = "status")
	private boolean status;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
	@JsonIgnoreProperties("subComments")
	private Users users;

	@ManyToOne
	@JoinColumn(name = "comment_id", referencedColumnName = "id", insertable = false, updatable = false)
	@JsonIgnoreProperties("comments")
	private Comments comments;

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
	 * @return the commentId
	 */
	public int getCommentId() {
		return commentId;
	}

	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
	 * @return the sendId
	 */
	public int getSendId() {
		return sendId;
	}

	/**
	 * @param sendId the sendId to set
	 */
	public void setSendId(int sendId) {
		this.sendId = sendId;
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
	 * @return the comments
	 */
	public Comments getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(Comments comments) {
		this.comments = comments;
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

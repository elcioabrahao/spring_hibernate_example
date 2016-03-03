package br.com.iuapp.mtu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	private Long userId;
	private String username;
	private String createdBy;
	private String createdDate;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(nullable = true,name="USERNAME")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(nullable = true,name="CREATED_BY")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(nullable = true,name="CREATED_DATE")
	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + "]";
	}


	
	
}

package com.xz.boot2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 短信验证码
 * @author zouzhengqing
 *
 */
@Entity
@Table(name = "authentication")
public class Authentication implements Serializable {
	//主键
	@Id
	private Integer id;
	//手机号码
	private String phone;
	//验证码
	private String phone_Code;
	//时间
	private Date date;
	//时间戳
	private Date udate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone_Code() {
		return phone_Code;
	}
	public void setPhone_Code(String phone_Code) {
		this.phone_Code = phone_Code;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	@Override
	public String toString() {
		return "Authentication [id=" + id + ", phone=" + phone + ", phone_Code=" + phone_Code + ", date=" + date
				+ ", udate=" + udate + "]";
	}
	
	}

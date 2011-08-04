package com.supermy.rest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.supermy.core.domain.BaseDomain;

import com.supermy.rest.util.extjs.ExtDateDeserializer;
import com.supermy.rest.util.extjs.ExtDateSerializer;



@Entity
@Table(name="CONTACT")
@org.hibernate.annotations.Entity(dynamicUpdate = true, dynamicInsert = true)
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Contact extends BaseDomain{
	
	
	@Column(name="CONTACT_NAME", nullable=false)
	private String name;
	@Column(name="CONTACT_PHONE", nullable=false)
	private String phone;
	@Column(name="CONTACT_EMAIL", nullable=false)
	private String email;
	@Column(name="BIRTHDATE", nullable=false)
    private Date birthDate;
	
	
////    private Date createDate;
//	@Id
//	@GeneratedValue
//	@Column(name="CONTACT_ID")
//	private int id;
//	
//	public int getId() {
//		return id;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public Contact() {
		super();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

    @JsonSerialize(using = ExtDateSerializer.class)
    @JsonProperty("dob")
	public Date getBirthDate() {
		return birthDate;
	}

    @JsonDeserialize(using = ExtDateDeserializer.class)
    @JsonProperty("dob")
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

//    @JsonSerialize(using = ExtDateSerializer.class)
//    @JsonProperty("createdate")
//	@Column(name="CreateDate", nullable=false)
//	public Date getCreateDate() {
//		return createDate;
//	}
//
//    @JsonDeserialize(using = ExtDateDeserializer.class)
//    @JsonProperty("createdate")
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
    
}

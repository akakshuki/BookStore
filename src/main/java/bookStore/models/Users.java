package bookStore.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Users")
@EntityListeners(AuditingEntityListener.class)
public class Users {
	private int Idu;
	private String FirstnameU;
	private String LastnameU;
	private Date DofbU;
	private String AddressU;
	private int PhoneU;
	private String EmailU;
	private boolean SexU;
	private String UsernameU;
	private String PasswordU;
	private Date DatecreateU;
	private boolean StatusU;
	private int Idut;
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idu",nullable = false) 
	public int getIdu() {
		return Idu;
	}
	public void setIdu(int idu) {
		Idu = idu;
	}
	
	@Column(name="firstnameu",nullable=false,length = 50)
	public String getFirstnameU() {
		return FirstnameU;
	}
	public void setFirstnameU(String firstnameU) {
		FirstnameU = firstnameU;
	}
	@Column(name="lastnameu",nullable=false,length = 50)
	public String getLastnameU() {
		return LastnameU;
	}
	public void setLastnameU(String lastnameU) {
		LastnameU = lastnameU;
	}
	@Column(name="dofbu",nullable=false)
	public Date getDofbU() {
		return DofbU;
	}
	public void setDofbU(Date dofbU) {
		DofbU = dofbU;
	}
	@Column(name="addressu",nullable=false,length = 200)
	public String getAddressU() {
		return AddressU;
	}
	public void setAddressU(String addressU) {
		AddressU = addressU;
	}
	@Column(name="phoneu",nullable=false)
	public int getPhoneU() {
		return PhoneU;
	}
	public void setPhoneU(int phoneU) {
		PhoneU = phoneU;
	}
	@Column(name="emailu",nullable=false,length = 200)
	public String getEmailU() {
		return EmailU;
	}
	public void setEmailU(String emailU) {
		EmailU = emailU;
	}
	@Column(name="sexu",nullable=false)
	public boolean isSexU() {
		return SexU;
	}
	public void setSexU(boolean sexU) {
		SexU = sexU;
	}
	@Column(name="usernameu",nullable=false,length = 100)
	public String getUsernameU() {
		return UsernameU;
	}
	public void setUsernameU(String usernameU) {
		UsernameU = usernameU;
	}
	@Column(name="passwordu",nullable=false)
	public String getPasswordU() {
		return PasswordU;
	}
	public void setPasswordU(String passwordU) {
		PasswordU = passwordU;
	}
	@Column(name="datecreateu",nullable=false)
	public Date getDatecreateU() {
		return DatecreateU;
	}
	public void setDatecreateU(Date datecreateU) {
		DatecreateU = datecreateU;
	}
	@Column(name="statusu",nullable=false)
	public boolean isStatusU() {
		return StatusU;
	}
	public void setStatusU(boolean statusU) {
		StatusU = statusU;
	}
	@Column(name="Idut",nullable=false)
	public int getIdut() {
		return Idut;
	}
	public void setIdut(int idut) {
		Idut = idut;
	}

}

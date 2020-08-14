package bookStore.models.views;

import java.sql.Date;

public class UsersView {
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
	
	public int getIdu() {
		return Idu;
	}
	public void setIdu(int idu) {
		Idu = idu;
	}
	public String getFirstnameU() {
		return FirstnameU;
	}
	public void setFirstnameU(String firstnameU) {
		FirstnameU = firstnameU;
	}
	public String getLastnameU() {
		return LastnameU;
	}
	public void setLastnameU(String lastnameU) {
		LastnameU = lastnameU;
	}
	public Date getDofbU() {
		return DofbU;
	}
	public void setDofbU(Date dofbU) {
		DofbU = dofbU;
	}
	public String getAddressU() {
		return AddressU;
	}
	public void setAddressU(String addressU) {
		AddressU = addressU;
	}
	public int getPhoneU() {
		return PhoneU;
	}
	public void setPhoneU(int phoneU) {
		PhoneU = phoneU;
	}
	public String getEmailU() {
		return EmailU;
	}
	public void setEmailU(String emailU) {
		EmailU = emailU;
	}
	public boolean isSexU() {
		return SexU;
	}
	public void setSexU(boolean sexU) {
		SexU = sexU;
	}
	public String getUsernameU() {
		return UsernameU;
	}
	public void setUsernameU(String usernameU) {
		UsernameU = usernameU;
	}
	public String getPasswordU() {
		return PasswordU;
	}
	public void setPasswordU(String passwordU) {
		PasswordU = passwordU;
	}
	public Date getDatecreateU() {
		return DatecreateU;
	}
	public void setDatecreateU(Date datecreateU) {
		DatecreateU = datecreateU;
	}
	public boolean isStatusU() {
		return StatusU;
	}
	public void setStatusU(boolean statusU) {
		StatusU = statusU;
	}
	public int getIdut() {
		return Idut;
	}
	public void setIdut(int idut) {
		Idut = idut;
	}

}

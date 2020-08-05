package bookStore.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usertypes {
	private int Idut;
	private String NameUT;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idut",nullable = false) 
	public int getIdut() {
		return Idut;
	}
	public void setIdut(int idut) {
		Idut = idut;
	}
	@Column(name="nameut",nullable = false) 
	public String getNameUT() {
		return NameUT;
	}
	public void setNameUT(String nameUT) {
		NameUT = nameUT;
	}

}

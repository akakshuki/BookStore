package bookStore.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Usertypes")
@EntityListeners(AuditingEntityListener.class)
public class Usertypes {
	private int Idut;
	private String NameUT;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="Idut",nullable = false) 
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

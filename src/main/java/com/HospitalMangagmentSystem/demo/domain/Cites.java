package com.HospitalMangagmentSystem.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cities")
//@JsonIgnoreProperties("adres")
public class Cites extends AuditModel {
    @Id
	@Column(name="`City-Code`")
    @GeneratedValue
	private int Ciy_Code;
    
	private String City_Name;
	
	@OneToMany(mappedBy="city", cascade = CascadeType.ALL)
	//@JsonManagedReference
	@JsonIgnore
      private Set<Address> adres;

	




	public int getCiy_Code() {
		return Ciy_Code;
	}

	public void setCiy_Code(int ciy_Code) {
		Ciy_Code = ciy_Code;
	}

	public String getCity_Name() {
		return City_Name;
	}

	public void setCity_Name(String city_Name) {
		City_Name = city_Name;
	}

	public Set<Address> getAdres() {
		return adres;
	}

	public void setAdres(Set<Address> adres) {
		this.adres = adres;
	}
	
	
	
	
}

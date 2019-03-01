package com.example.demo.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Clan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String ime;
	@Column(nullable=false)
	private String prezime;
	@Column(nullable=false)
	private String pol;
	@Column(nullable=false)
	private Integer godine;	
	@Column(nullable=false)
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clan")
	@JsonBackReference
	private List<Pretplata> pretplata;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clan")
	@JsonBackReference
	private List<Termin> termin;
	


	public Clan() {
		super();
	}
	
	public Clan(Long id, String ime, String prezime, String pol, Integer godine, String email,
			List<Pretplata> pretplata, List<Termin> termin) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.godine = godine;
		this.email = email;
		this.pretplata = pretplata;
		this.termin = termin;
	}
	
	

	public Clan(String ime, String prezime, String pol, Integer godine, String email, List<Pretplata> pretplata,
			List<Termin> termin) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.godine = godine;
		this.email = email;
		this.pretplata = pretplata;
		this.termin = termin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public Integer getGodine() {
		return godine;
	}

	public void setGodine(Integer godine) {
		this.godine = godine;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	public List<Pretplata> getPretplata() {
		return pretplata;
	}

	public void setPretplata(List<Pretplata> pretplata) {
		this.pretplata = pretplata;
	}

	public List<Termin> getTermin() {
		return termin;
	}

	public void setTermin(List<Termin> termin) {
		this.termin = termin;
	}

	@Override
	public String toString() {
		return "Clan [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", pol=" + pol + ", godine=" + godine
				+ ", email=" + email + "]";
	}
	
	
	

}

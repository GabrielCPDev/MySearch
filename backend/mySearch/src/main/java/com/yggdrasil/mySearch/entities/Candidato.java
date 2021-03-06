package com.yggdrasil.mySearch.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yggdrasil.mySearch.entities.enums.Partido;

@Entity
public class Candidato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Partido partido;
	@JsonIgnore
	@ManyToOne
	private Chapa chapa;
	
	public Candidato () {
	}

	public Candidato(Long id, String name, Partido partido, Chapa chapa) {
		super();
		this.id = id;
		this.name = name;
		this.partido = partido;
		this.chapa = chapa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Chapa getChapa() {
		return chapa;
	}

	public void setChapa(Chapa chapa) {
		this.chapa = chapa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candidato [id=" + id + ", name=" + name + ", partido=" + partido + ", chapa=" + chapa + "]";
	}
	
}

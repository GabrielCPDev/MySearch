package com.yggdrasil.mySearch.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Chapa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToOne
	private Candidato prefeito;
	@OneToOne
	private Candidato vicePrefeito;
	
	@JsonIgnore	
	@OneToMany(mappedBy = "voto")
	private List<Registro> votos = new ArrayList<Registro>();
	
	public Chapa () {
	}

	public Chapa(Long id, String nome, Candidato prefeito, Candidato vicePrefeito) {
		super();
		this.id = id;
		this.nome = nome;
		this.prefeito = prefeito;
		this.vicePrefeito = vicePrefeito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Candidato getPrefeito() {
		return prefeito;
	}

	public void setPrefeito(Candidato prefeito) {
		this.prefeito = prefeito;
	}

	public Candidato getVicePrefeito() {
		return vicePrefeito;
	}

	public void setVicePrefeito(Candidato vicePrefeito) {
		this.vicePrefeito = vicePrefeito;
	}
	

	public List<Registro> getVotos() {
		return votos;
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
		Chapa other = (Chapa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chapa [id=" + id + ", nome=" + nome + "]";
	}

	
	

}

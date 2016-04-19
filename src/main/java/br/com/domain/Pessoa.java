package br.com.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(nullable = false)
	private String primeiroNome;
	
	private String nomeDoMeio;
	
	@Column(nullable = false)
	private String sobrenome;
	
	@Column(length = 9)
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(length = 200)
	private String email;

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getNomeDoMeio() {
		return nomeDoMeio;
	}

	public void setNomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return codigo;
	}

	public void setId(Long id) {
		this.codigo = id;
	}
}
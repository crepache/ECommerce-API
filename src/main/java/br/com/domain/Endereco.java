package br.com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Endereco {
	
	// Annotation e demais campos
	
	@ManyToOne // Pensar nesse relacionamento
	private Pessoa pessoa;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	private TipoEndereco tipoEndereco;
	
	@Column(length = 100)
	private String logradouro;

	@Column(length = 10)
	private String numero;
	
	@Column(length = 60)
	private String bairro;

	@Column(length = 9)
	private String cep;

	@Column(length = 30)
	private String cidade;

	@Column(length = 30)
	private String estado;

	@Column(length = 30)
	private String complemento;
	
	@NotNull
	private Pais pais;	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

}

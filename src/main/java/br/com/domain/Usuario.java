package br.com.domain;

import javax.persistence.Column;

public class Usuario extends Pessoa {
	
	@Column(nullable = false, length = 100)
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}

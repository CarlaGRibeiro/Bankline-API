package com.dio.santander.bankline.api.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {

	@Column
	private Long numero;
	@Column
	private Double saldo;

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}

package br.com.caelum.cap11.banco.model;

import java.math.BigDecimal;

public class ContaCorrente implements Conta {
	
	private String numero;
	private Cliente cliente;
	private BigDecimal saldo;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void deposita(BigDecimal valor) {
		if (valor.doubleValue() < 0) {
			throw new IllegalArgumentException("Erro: Valor inválido!");
		} else {
			this.saldo.add(valor);
		}
	}

	@Override
	public void saca(BigDecimal valor) {
		if (valor.doubleValue() > saldo.doubleValue()){
			throw new IllegalArgumentException("Erro: Saldo insuficiente!");
		} else {
			this.saldo.subtract(valor);
		}
	}

	@Override
	public BigDecimal getSaldo() {
		return this.saldo;
	}

}

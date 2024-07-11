package com.one.digitalinnovation;

public class TransferenciaBancaria extends Conta {
	
	public void transferirSaldo(Conta contaDestino, int valor) {
		if (saldo <= 0) {
			throw new IllegalArgumentException("Valor precisa ser maior que 0");
		} else {
			if (valor > super.saldo) {
				throw new RuntimeException("Você não tem saldo suficiente para realizar a transição.");
			} else {
				super.saldo -= valor;
			}
		}
	}

}

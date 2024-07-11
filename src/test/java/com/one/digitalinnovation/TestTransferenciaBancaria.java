package com.one.digitalinnovation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class TestTransferenciaBancaria {

	@BeforeAll
	static void introducaoTestes() {
		System.out.println("Introdução aos testes.");
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testTransferirSaldoExcecao() {
		Conta contaDoFulano = new Conta(9201, 0);
		TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria();
		
		// "assertThrows" realiza um teste para verificar se um determinado método irá lançar a exceção especificada pelo desenvolvedor.
		// atenção a sintaxe: ele recebe uma exceção específica e uma Supplier logo em seguida para realizar a validação
		assertThrows(IllegalArgumentException.class, () -> 
		transferenciaBancaria.transferirSaldo(contaDoFulano, 0));
		
		// "assertDoesNotThrow" faz o contrário: ele verifica se um método NÃO lançará uma exceção. Ou seja, caso lance, retorna false.
		// diferente do "assertThrows", o "assertDoesNotThrow" recebe apenas um supplier
		assertDoesNotThrow(() -> transferenciaBancaria.transferirSaldo(contaDoFulano, 0));
	}
	
	@AfterAll
	static void encerramentoTestes() {
		System.out.println("Encerramento aos testes.");
	}

}

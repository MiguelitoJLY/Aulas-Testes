package com.one.digitalinnovation;

import org.junit.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;

class TestAfterBefore {

	@BeforeAll // Usado no começo dos testes. Será a primeira ação antes dos testes serem realizados. O método que possui a anotação "BeforeAll" SEMPRE precisa ser estático
	static void introducaoTeste() {
		System.out.println("Introdução aos testes.");
	}
	
	@Before // Será colocado ANTES de TODOS os testes
	void testeIniciar() {
		System.out.println("Começando teste...");
	}
	
	@Test
	void teste1() {
		System.out.println("Teste 1");
	}
	
	@Test
	void teste2() {
		System.out.println("Teste 2");
	}
	
	@Test
	void teste3() {
		System.out.println("Teste 3");
	}
	
	@After // Será colocado DEPOIS de TODOS os testes
	void testeFim() {
		System.out.println("Finalizando teste...");
	}
	
	@AfterAll // Usado no fim dos testes. Será a última ação depois que todos os testes foram realizados. O método que possui a anotação "AfterAll" SEMPRE precisa ser estático
	static void testeEncerrar() {
		System.out.println("Encerramento dos testes.");
	}

}

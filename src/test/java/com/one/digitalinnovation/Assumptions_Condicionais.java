package com.one.digitalinnovation;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class Assumptions_Condicionais {

	@BeforeAll
	static void introducaoTestes() {
		System.out.println("Introdução aos Testes:");
		System.out.println("");
	}
	
	
	@Test
	@EnabledOnOs(OS.WINDOWS) // O teste é habilitado se o SO for o indicado no parâmetro
	void testOS1() {
		int[] l1 = {10, 20, 30, 40, 50};
		int[] l2 = {10, 20, 30, 40, 50};
		
		assertArrayEquals(l1, l2);
	}
	
	@Test
	@EnabledOnOs({OS.WINDOWS, OS.LINUX}) // O teste é habilitado se o SO for algum dos indicados no parâmetro
	void testOS2() {
		assertEquals(10, 5 + 5);
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_21) // O teste é habilitado em somente uma versão Java
	void testJre() {
		assertNotEquals(20, 10 + 5);
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_22) // O teste é habilitado quando estiver dentro da versão mínima até a versão máxima do Java indicado
	void testJreRange() {
		assertNotEquals(50, 20 - 8);
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "Miguel", matches = "Miguel") // O teste é habilitado se o nome do usuário no PC bate com o nome indicado.
	void testUser() {
		System.out.println("Bumbum");
	}
	
	@AfterAll
	static void encerramentoTestes() {
		System.out.println("");
		System.out.println("Encerramento dos Testes.");
	}

}

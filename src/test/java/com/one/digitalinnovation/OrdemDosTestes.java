package com.one.digitalinnovation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Os testes acontecem na ordem dos números que estabelecemos, de forma crescente (menor para maior)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrdemDosTestes {

	@Order(3) // este começará por último
	@Test
	void FluxoA() {
		assertEquals(20, 5 + 15);
	}
	
	@Order(2)
	@Test
	void FluxoB() {
		assertEquals(20, 5 + 15);
	}
	
	@Order(1) // este começará primeiro
	@Test
	void FluxoC() {
		assertEquals(20, 5 + 15);
	}

}

// Os testes acontecem na ordem alfabética do nome dos métodos
@TestMethodOrder(MethodOrderer.MethodName.class)
class OrdemDosTestes2 {
	
	@Test // este começará primeiro
	void FluxoA() {
		assertEquals(50, 35 + 15);
	}
	
	@Test
	void FluxoB() {
		assertEquals(50, 35 + 15);
	}
	
	@Test // este começará por último
	void FluxoC() {
		assertEquals(50, 35 + 15);
	}
}

// Semelhante ao "MethodName", mas este levará em consideração o valor que colocarmos na anotação "DisplayName"
@TestMethodOrder(MethodOrderer.DisplayName.class)
class OrdemDosTestes3 {
	
	@DisplayName("B")
	@Test
	void FluxoA() {
		assertEquals(50, 35 + 15);
	}
	
	@DisplayName("C") // Este começará por último
	@Test
	void FluxoB() {
		assertEquals(50, 35 + 15);
	}
	
	@DisplayName("A") // Este começará primeiro
	@Test
	void FluxoC() {
		assertEquals(50, 35 + 15);
	}
	
}

// Não há ordem. Os testes são executados de forma aleatória
@TestMethodOrder(MethodOrderer.Random.class)
class OrdemDosTestes4 {
	
	@Test
	void FluxoA() {
		assertEquals(50, 35 + 15);
	}
	
	@Test
	void FluxoB() {
		assertEquals(50, 35 + 15);
	}
	
	@Test
	void FluxoC() {
		assertEquals(50, 35 + 15);
	}
	
}

package com.one.digitalinnovation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	
	
	@Test // Um método que será usado como "test" precisa da anotação "@Test"
	void testHello() {
		Person person = new Person();
		assertEquals("hey!", person.hello());
	}
	
	@Test
	void testIdade() {
		Person person = new Person("Miguel", 21);
		assertEquals(21, person.getIdade()); // Testa se é igual
	}
	
	@Test
	void testMaiorIdade() {
		Person person1 = new Person("Miguel", 21);
		assertTrue(person1.maiorIdade()); // Testa se é verdadeiro
		
		Person person2 = new Person("Geovanna", 10);
		assertFalse(person2.maiorIdade()); // Testa se é falso
	}
	
	@Test
	void validarArray() {
		int[] primeiroLancamento = {10, 20, 30, 40, 50};
		int[] segundoLancamento = {10, 15, 20, 25, 30};
		
		assertNotEquals(primeiroLancamento, segundoLancamento); // Testa se o primeiro parâmetro é diferente do segundo, tanto em comprimento quanto em valores
		
		int[] terceiroLancamento = {20, 40, 60, 80, 100};
		int[] quartoLancamento = {20, 40, 60, 80, 100};
		
		assertArrayEquals(terceiroLancamento, quartoLancamento); // Testa se o primeiro array é idêntico ao segundo, tanto em comprimento quanto em valores
	}
	
	@Test
	void testNull() {
		Person person = null;
		
		assertNull(person); // Verifica se uma variável possui o valor nulo
		
		Person person2 = new Person();
		
		assertNotNull(person2); // Verifica se uma variável NÃO possui um valor nulo
	}
}

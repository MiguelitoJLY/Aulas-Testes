package com.one.digitalinnovation;

public class Person {
	
	private String nome;
	private int idade;
	
	public Person() {}
	
	public Person(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String hello() {
		return "hey!";
	}
	
	public boolean maiorIdade() {
		return this.idade >= 18;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	

}

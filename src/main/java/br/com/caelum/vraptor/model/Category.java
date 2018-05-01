package br.com.caelum.vraptor.model;

public enum Category {
	HIDRAULICA("HIDRAULICA"), 
	ELETRICA("ELETRICA"), 
	LIMPEZA("LIMPEZA"), 
	FERRAMENTAS("FERRAMENTAS"), 
	CONSTRUCAO_CIVIL("CONSTRUCAO CIVIL");

	private final String nome;

	Category(String nome) {
		this.nome = nome;
	}
	
	public String nome(String nome) {
		return nome;
	}
}
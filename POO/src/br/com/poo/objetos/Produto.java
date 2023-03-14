package br.com.poo.classes;

public class Produto {
	private int id;
	private String nome;
	private int quantidade;
	private Categoria categoria;
	private Fornecedor fornecedor; 
	
	
	
	
	//Vamos criar um metodo construtor. Este metodo é 
	//executado todas as vezes que uma classe é instânciada 
	public Produto(int id, String nome, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
		
		
		
	}
	
	
	public void cadastrar() { 
		 System.out.println("Produto cadastro");
		 
	} 
	


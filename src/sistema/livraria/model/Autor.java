package sistema.livraria.model;

import java.time.LocalDate;

public class Autor {
	
	private static int contador = 1;
	
	private String nome; 
	private LocalDate dataNascimento;
	
	public Autor(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Autor.contador = contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	} 
	
	
	
	
}

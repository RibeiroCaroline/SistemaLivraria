package sistema.livraria.model;

import java.time.LocalDate;

public class Emprestimo {
	
	private Livro livro; 
	private Usuario usuario;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private boolean ativo;
	
	
	public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucao,
			boolean ativo) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.ativo = ativo;
		 
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}


	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}


	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}


	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	} 
	
	public void visualizarEmprestimos() {
		System.out.println("Livro: " + livro.getTitulo());
		System.out.println("Usuário: " + usuario.getNome());
		System.out.println("Data de Empréstimo: " + dataEmprestimo);
		System.out.println("Data de Devolução: " + dataDevolucao);
		System.out.println("Status: " + (ativo ? "Ativo" : "Finalizado"));
		System.out.println("------------------------------------------");
	}
	
	
	
	
	
	
	
	

}

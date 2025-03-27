package sistema.livraria.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sistema.livraria.model.Autor;
import sistema.livraria.model.Emprestimo;
import sistema.livraria.model.Livro;
import sistema.livraria.model.Usuario;
import sistema.livraria.repository.BibliotecaRepository;

public class BibliotecaController implements BibliotecaRepository {
	
	private List<Livro> livros = new ArrayList<>();
	
	private List<Autor> autores = new ArrayList<>();
	
	private List<Emprestimo> emprestimos = new ArrayList<>();
	
	private List<Usuario> usuarios = new ArrayList<>(); 
	
	@Override
	public void cadastrarLivro (Livro livro) {
		livros.add(livro); 
	}

	@Override
	public void listarLivrosDisponiveis() {
		 for(var livro : livros) {
			 livro.visualizar();
		 }
	}

	@Override
	public void emprestarLivro(Livro livro, Usuario usuario) {
		if (livros.contains(livro)) {
			LocalDate hoje = LocalDate.now();
			LocalDate dataDevolucao = hoje.plusDays(15);
			
			Emprestimo emprestimo = new Emprestimo(livro, usuario, hoje, dataDevolucao, true);
			
			emprestimos.add(emprestimo);
			
			livros.remove(livro);
			
			System.out.println("Livro " + livro.getTitulo() + " emprestado para " + usuario.getNome() + " com sucesso!!");
		} else {
			System.out.println("Livro não disponível para empréstimo");
		}
		
	}

	@Override
	public void cadastrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	@Override
	public void listarUsuario() {
		for (Usuario usuario : usuarios) {
			usuario.visualizarUsuario();
		}
	}

	@Override
	public Livro buscarLivroPorId (int id) {
		for (Livro livro : livros) {
			if (livro.getId() == id) {
				return livro;
			}
		}
		return null;
		
	}

	@Override
	public void consultarHistoricoLivro(Livro livro) {
		for (Emprestimo emprestimo : emprestimos) {
			if(emprestimo.getLivro().equals(livro)) {
				emprestimo.visualizarEmprestimos();
			}
			
		}
	}

	@Override
	public void consultarHistoricoUsuario(Usuario usuario) {
		for (Emprestimo emprestimo : emprestimos) {
			if(emprestimo.getUsuario().equals(usuario)) {
				emprestimo.visualizarEmprestimos();
			}
		}
	}

	@Override
	public void devolverLivro(Livro livro) {
		
	}
}

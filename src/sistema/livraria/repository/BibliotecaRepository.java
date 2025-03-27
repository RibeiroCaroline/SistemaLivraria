package sistema.livraria.repository;

import sistema.livraria.model.Livro;
import sistema.livraria.model.Usuario;

public interface BibliotecaRepository {
	
	public void cadastrarLivro (Livro livro);
	
	public void listarLivrosDisponiveis();
	
	public void emprestarLivro(Livro livro, Usuario usuario);
	
	public void cadastrarUsuario(Usuario usuario); 
	
	public void listarUsuario();
	
	public Livro buscarLivroPorId(int id);
	
	public void consultarHistoricoLivro(Livro livro);
	
	public void consultarHistoricoUsuario(Usuario usuario);
	
	public void devolverLivro(Livro livro);


}

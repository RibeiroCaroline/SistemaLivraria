package sistema.livraria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import sistema.livraria.controller.BibliotecaController;
import sistema.livraria.model.Autor;
import sistema.livraria.model.Livro;
import sistema.livraria.model.Usuario;

public class Menu {


	public static void main(String[] args) {
		
		BibliotecaController bibliotecaController = new BibliotecaController(); 
		
		//Autores 
		 Autor autor1 = new Autor("J.K. Rowling", LocalDate.of(1965, 7, 31));
	     Autor autor2 = new Autor("George Orwell", LocalDate.of(1903, 6, 25));
	     Autor autor3 = new Autor("Jane Austen", LocalDate.of(1775, 12, 16));
	     Autor autor4 = new Autor("J.R.R. Tolkien", LocalDate.of(1892, 1, 3));
	     Autor autor5 = new Autor("Machado de Assis", LocalDate.of(1839, 6, 21));
	     
	     //Livros 
	     Livro livro1 = new Livro("0", "Harry Potter e a Pedra Filosofal", autor1, true, LocalDateTime.now());
	     bibliotecaController.cadastrarLivro(livro1);
	     Livro livro2 = new Livro("1", "1984", autor2, true, LocalDateTime.now().minusDays(10));
	     bibliotecaController.cadastrarLivro(livro2);
	     Livro livro3 = new Livro("2", "Orgulho e Preconceito", autor3, true, LocalDateTime.now().minusMonths(2));
	     bibliotecaController.cadastrarLivro(livro3);
	     Livro livro4 = new Livro("3", "O Senhor dos Anéis", autor4, true, LocalDateTime.now());
	     bibliotecaController.cadastrarLivro(livro4);
	     Livro livro5 = new Livro("4", "Dom Casmurro", autor5, true, LocalDateTime.now());
	     bibliotecaController.cadastrarLivro(livro5);
	     
	     
	     // 🧑‍💻 Criando Usuários
	     Usuario usuario1 = new Usuario(1, "Alice", "1995-05-20", "alice@email.com");
	     Usuario usuario2 = new Usuario(2, "Bob", "1992-11-15", "bob@email.com");
	     Usuario usuario3 = new Usuario(3, "Helo", "1992-11-15", "helo@email.com");

	     // 📌 Criando Empréstimos Manualmente
	     bibliotecaController.emprestarLivro(livro1, usuario1);
	     bibliotecaController.emprestarLivro(livro2, usuario1);
	     bibliotecaController.emprestarLivro(livro3, usuario2);
	     
	     // 🔎 Testando o histórico de empréstimos de "Harry Potter e a Pedra Filosofal"
	     System.out.println("\n=== Histórico de Empréstimos para 'Harry Potter e a Pedra Filosofal' ===");
	     bibliotecaController.consultarHistoricoLivro(livro1);
	     
	     // 🔎 Testando o histórico de empréstimos de "1984"
	     System.out.println("\n=== Histórico de Empréstimos para '1984' ===");
	     bibliotecaController.consultarHistoricoLivro(livro2);
	     
	  // 🔎 Testando o histórico de um usuário (Alice)
	     System.out.println("\n=== Histórico de Empréstimos para Usuário: Alice ===");
	     bibliotecaController.consultarHistoricoUsuario(usuario1);

		
		Scanner leia = new Scanner (System.in);
		String opcao = null;
		String nomeUsuario;
		int idLivro;
		
		while(true) {
			System.out.println("------------------------------------------------");
			System.out.println("                   HELÔ LIVRARIA                ");
			System.out.println("Você deseja ver os livros disponíveis? [SIM/NAO]");
			System.out.println("------------------------------------------------");
			
			opcao = leia.next().toUpperCase();
			
			switch (opcao) {
			case "SIM": 
				
				
				System.out.println("Escolha um livro pelo ID: ");
				bibliotecaController.listarLivrosDisponiveis();
				idLivro = leia.nextInt();
				
				System.out.println("Agora digite o seu nome: ");
				nomeUsuario = leia.next();
				
				Livro livroEscolhido = bibliotecaController.buscarLivroPorId(idLivro);	
				
				Usuario usuario = new Usuario (nomeUsuario);
				
				bibliotecaController.emprestarLivro(livroEscolhido, usuario);
				
				break;
				
			case "NAO": 
				System.out.println("Helô livraria agradece por utilizar nosso sistema. Volte sempre! ");
				leia.close();
				System.exit(0);
			}
		
		}
	}

}

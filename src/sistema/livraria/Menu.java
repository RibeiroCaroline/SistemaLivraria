package sistema.livraria;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import sistema.livraria.controller.BibliotecaController;
import sistema.livraria.model.Autor;
import sistema.livraria.model.Livro;
import sistema.livraria.model.Usuario;

public class Menu {


	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String nomeUsuario, titulo, nomeAutor, opcao;
		int idLivro;
		
		BibliotecaController bibliotecaController = new BibliotecaController();
		
		//Autores 
		 Autor autor1 = new Autor("J.K. Rowling", LocalDate.of(1965, 7, 31));
	     Autor autor2 = new Autor("George Orwell", LocalDate.of(1903, 6, 25));
	     Autor autor3 = new Autor("Jane Austen", LocalDate.of(1775, 12, 16));
	     Autor autor4 = new Autor("J.R.R. Tolkien", LocalDate.of(1892, 1, 3));
	     Autor autor5 = new Autor("Machado de Assis", LocalDate.of(1839, 6, 21));
	     
	     //Livros 
	     Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", autor1, true, LocalDateTime.now());
	     bibliotecaController.cadastrarLivro(livro1);
	     Livro livro2 = new Livro("1984", autor2, true, LocalDateTime.now().minusDays(10));
	     bibliotecaController.cadastrarLivro(livro2);
	     Livro livro3 = new Livro("Orgulho e Preconceito", autor3, true, LocalDateTime.now().minusMonths(2));
	     bibliotecaController.cadastrarLivro(livro3);
	     Livro livro4 = new Livro("O Senhor dos Anéis", autor4, true, LocalDateTime.now());
	     bibliotecaController.cadastrarLivro(livro4);
	     Livro livro5 = new Livro("Dom Casmurro", autor5, true, LocalDateTime.now());
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
	     
	     bibliotecaController.listarLivrosDisponiveis();
	     
	     bibliotecaController.devolverLivro(livro1);
	     
	     bibliotecaController.listarLivrosDisponiveis();
	     
	     bibliotecaController.emprestarLivro(livro1, usuario2);
	     
	     bibliotecaController.consultarHistoricoLivro(livro1);
		
		while(true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("                       HELÔ LIVRARIA                   ");
			System.out.println("     1 - Se você deseja cadastrar um novo livro        ");
			System.out.println("     2 - Se você deseja ver os livros disponíveis      ");
			System.out.println("     3 - Sair                                          ");
			System.out.println("-------------------------------------------------------");
			
			opcao = leia.nextLine();
			
			switch (opcao) {
			case "1":
				System.out.println("Digite o título do livro: ");
				titulo = leia.nextLine();
				
				System.out.println("Digite o nome do autor: ");
				nomeAutor = leia.nextLine();
				
				Autor autor = new Autor (nomeAutor);
				
				Livro livro = new Livro(titulo, autor, true, LocalDateTime.now());
				
				bibliotecaController.cadastrarLivro(livro);		
				
				KeyPress();
				break;
				
			case "2": 
				System.out.println("Escolha um livro pelo ID: \n");
				bibliotecaController.listarLivrosDisponiveis();
				idLivro = leia.nextInt();
				
				 leia.nextLine();
				
				System.out.println("Agora digite o seu nome: ");
				nomeUsuario = leia.next();
				
				Livro livroEscolhido = bibliotecaController.buscarLivroPorId(idLivro);	
				
				Usuario usuario = new Usuario (nomeUsuario);
				
				bibliotecaController.emprestarLivro(livroEscolhido, usuario);
				
				KeyPress();
				break;
			case "3": 
				System.out.println("Helô livraria agradece por utilizar nosso sistema. Volte sempre! ");
				leia.close();
				System.exit(0);
				
			default:
				System.out.println("Opção Inválida!\n");
				break;
			}
		}
	}
	public static void sobre() {
		System.out.println("\n****************************************************");
		System.out.println("Projeto Desenvolvido por: Caroline Ribeiro");
		System.out.println("Caroline Ribeiro - carolineribeiro1996@gmail.com");
		System.out.println("github.com/RibeiroCaroline");
		System.out.println("****************************************************");
	}

	public static void KeyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter! ");
		}
	}
}

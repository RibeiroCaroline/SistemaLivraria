package sistema.livraria.model;

public class Usuario {

	private static int contador = 1;
	private int id;
	private String nome;
	private String dataNascimento;
	private String email;
	
	// permitir criar obj usuario a partir somente do nome
	public Usuario(int id, String nome, String dataNascimento, String email) {
		this.id = contador++;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}
	
	public Usuario(String nome) {
		this.id = 0;
		this.nome = nome;
		this.dataNascimento = null;
		this.email = null;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Usuario.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void visualizarUsuario() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("E-mail: " + email);
	}
	
	
}

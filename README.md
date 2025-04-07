
# 📚 Sistema de Gestão de Biblioteca

Bem-vindo ao projeto de **Sistema de Gestão de Biblioteca**!  
Este projeto foi desenvolvido como parte de um desafio da trilha de **Java da Rocketseat**.  
O objetivo foi aplicar conceitos fundamentais de Java, como:

- Herança  
- Polimorfismo  
- Estruturas de repetição  
- Manipulação de datas  

---

## ✨ Funcionalidades

### 📖 Livros
- **Listar livros disponíveis**: Exibe apenas os livros que estão disponíveis para empréstimo.  
- **Realizar empréstimo de um livro**: Permite que o usuário escolha um livro disponível e registre o empréstimo.  
- **Buscar livros por título ou autor**.  
- **Cadastrar novo livro**: O sistema pergunta se deseja cadastrar um novo livro, solicita todos os dados e o adiciona à biblioteca, tornando-o disponível para empréstimo.  

### 👤 Clientes
- **Cadastro de clientes**: Classe `Cliente` com atributos como `id`, `nome`, `dataNascimento` e `email`.  
- **Listar todos os clientes cadastrados**.  
- **Associar empréstimos aos clientes**: Visualize quais livros cada cliente emprestou e quando.  
- **Consultar histórico de empréstimos** de um livro ou cliente específico, com datas de empréstimo e devolução.  

### 🔁 Empréstimos
- **Manter um registro completo de todos os empréstimos**, incluindo os devolvidos.  
- **Registrar devoluções**, atualizando a disponibilidade dos livros.  

---

## 🧩 Estrutura do Projeto

O projeto é dividido nas seguintes classes principais:

- **Livro**: Representa os livros da biblioteca.  
- **Autor**: Contém os dados dos autores.  
- **Usuario**: Representa os usuários da biblioteca.  
- **Emprestimo**: Gerencia empréstimos e devoluções.  
- **Biblioteca Controller**: Controla o array de livros, autores, clientes e registros de empréstimo e todas as outras funções.  

---

## 🛠 Requisitos

- Java Development Kit (JDK) 8 ou superior  
- IDE de sua escolha (Eclipse, IntelliJ IDEA, NetBeans, etc.)

---

## ▶️ Como Executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/RibeiroCaroline/SistemaLivraria.git

## ▶️ Após Iniciar

A aplicação apresentará um menu interativo com opções de cadastrar um novo livro, ver os livros disponíveis e após escolher um livro, você pode realizar o empréstimo, que será registrado e o livro marcado como indisponível.

---

## 🤝 Contribuindo

Sinta-se à vontade para contribuir com o projeto! Você pode:

- Reportar bugs  
- Sugerir novas funcionalidades  
- Enviar pull requests com melhorias ou correções

---

## 📄 Licença

Este projeto está licenciado sob a **MIT License**.

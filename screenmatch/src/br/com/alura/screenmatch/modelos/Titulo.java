package br.com.alura.screenmatch.modelos;

public class Titulo {
	private String nome; 
	private int anoLancamento;
	private boolean incluidoNoPlano; 
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setNome(String nome) { // String nome -> é parâmetro
		this.nome = nome;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibaFichaTecnica() { // VOID -> apenas registrar informação.
		// É comum e usado na grande maioria o nome do método no imperativo.
		System.out.println("\nNome do filme: " + nome); // .nome -> acesso o atributo do objeto.
		System.out.println("Ano de lançamento: " + anoLancamento); 
	}
	// Quando só faz algo e não tem o retorno utiliza o VOID, vai apenas imprimir a ficha técnica. 
	// VOID -> não tem retorno porque os atributos são definidos na classe Filme.
	// Na classe Filme, todos os filmes(objetos) sabem exibir a ficha técnica, é padrão.
	// Método(comportamentos) -> o que um filme faz  
	// nome, anoDeLancamento, ... -> posso pedir que o filme exiba a própria ficha técnica.

	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}

	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
		// RETORNO -> retorna valores que não sejam atributos da classe Filme.
	}

}

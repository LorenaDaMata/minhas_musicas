package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { /* extends -> a classe Filme herda todas as características da classe 
	Titulo.  class Filme -> todo filme, extends Titulo -> é um Titulo. */
	/* atributos é tudo que uma classe tem e métodos é tudo o que ela faz. No extends a classe Filme
	tem tudo que a classe titulo tem e faz tudo que a classe Titulo faz. */
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) (pegaMedia() / 2);
	}

}

/* - Classe especifica o conteúdo de um Objeto
- Declaração de variável; tudo o que é declarado 
aqui, todo filme tem, ou seja, todo filme tem um NOME. 
Por isso, não está no método MAIN. 

- Não posso escrever System Out Println, pois aqui é uma 
definição de uma classe(tudo que uma classe tem e tudo 
que uma classe faz.

- Essa classe é uma ideia, uma especificação de como eu 
acho que vai ser o meu filme, não é um filme propriamente 
dito, é como se fosse uma planta de uma casa(ela diz como 
vai ser uma casa, um esquema) e não uma casa pronta. */

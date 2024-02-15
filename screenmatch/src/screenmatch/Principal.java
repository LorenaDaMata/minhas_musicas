package screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme(); // -> Objeto
		/* Uma instância de uma classe é um novo objeto criado dessa 
		classe, com o operador new. Instanciar uma classe é criar um 
		novo objeto do mesmo tipo dessa classe. Uma classe somente poderá 
		ser utilizada após ser instanciada. */
		// Parte da direita -> cria um objeto em um espaço da memória. 
		// Parte da esquerda -> uma variável que se referencia, ou seja, guardando onde o objeto está.
		// Alimentar os atributos que o meu filme tem:
		meuFilme.setNome("O poderoso chefão");
		meuFilme.setAnoLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);

		meuFilme.exibaFichaTecnica(); // Invocação, ou seja, chamada de variável.
		// Em uma declaração de variável ou chamada de variável tem que usar os parênteses.
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println("Total de avaliações realizadas: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoLancamento(2000);
		lost.exibaFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
		
		Filme outroFilme = new Filme();
		outroFilme.setNome("Avatar");
		outroFilme.setAnoLancamento(2023);
		outroFilme.setDuracaoEmMinutos(200);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		outroFilme.exibaFichaTecnica();
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
		
		
		

	}

}
/* Foi criada uma classe nova,ou seja, um tipo novo, então na declaração
de variável irei ter colocar esse tipo criado por mim. Variável -> meuFilme.
- Filme meuFilme que é uma declaração, é exatamente o nome que criamos na 
classe. 
- new -> criar um novo objeto TIPO Filme. 
- Tipo  por Referência -> criado na minha memória um espaço para um objeto
chamado Filme, que armazena um espaço nome, anoDeLancamento, incluidoNoPlano,
..., chamados de atributos(características de um objeto). 
- A classe Filme(F) ela é um modelo(todo filme que você criar vai ter um nome
(especificação, ou seja, o atributo NOME não pode ser editado). Tentar acessar um 
atributo pelo nome da classe não pode.
- Encapsulamento -> não colocar a mão no meu atributo e trocar, caso não haja, haverá
problemas, como no exemplo acima, o usuário ter acesso a soma das avaliações e
total de avaliações e conseguir manipular a média dessas avaliações por vontade própria,
burlando a proximidade com o mundo real na orientação a objetos.
- Modificadores de acesso/Modificadores de visibilidade -> palavra-chave PRIVATE, irá proteger
o atributo, a classe de fora não consegue manipular os dados desse atributo, apenas a classe
em que esse atributo foi criado.
- Get -> pegar, obter valor.
- Set -> colocar/ atruir valor. O usuário inclui um valor em um atributo.
- Import -> forma que uma classe se referencia a outra quando estão em pacotes diferentes.
- Herança -> Classe principal, onde outras classes menores herdam atributos e métodos.
- Sobrescrita de Métodos -> anotação @override
- Classe mãe é generalização e as classes filhas são as especializações/Superclasse e subclasse.
- Atributos ou campos; métodos ou funções.
 */
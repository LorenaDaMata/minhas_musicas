package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal;
	
	public int getTempoTotal() {
		return tempoTotal;
	}
	
//	public void inclui(Filme f) {
//		tempoTotal += f.getDuracaoEmMinutos();
//	}
//	
//	public void inclui(Serie s) { // Sobrecarga de método, por ser parecido com o método acima.
//		tempoTotal += s.getDuracaoEmMinutos();
//	}
	
	public void inclui(Titulo titulo) {
		System.out.println("Adicionando duração de minutos de " + titulo);
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
	// Ctrl + Shift + O -> excluir imports que não são mais usados.
}

package teste;

import modelo.Filme;

/**
 * Classe responsável por instanciar a classe filme
 * @author Diego
 * @since 11/02/2014
 */

public class TestaFilme {//inicio da classe

	public static void main(String[] args) {//inicio do método main
		
		Filme f = new Filme();
		f.setCodigo(3735);
		f.setNome("A Era do Gelo");
		f.setValor(2.50);
		f.setDisponivel(true);
		
		System.out.println(f);
		
	}//fim do main

}//fim da classe
package rrf.programas;

import rrf.modelo.Diretor;
import rrf.modelo.Gerente;


class Testa_Funcionario {
	
	public static void main(String[] args) {
		
		Gerente saulo = new Gerente();
		Diretor rrf = new Diretor();
		
		saulo.setSalario(2000.0);		
		rrf.setSalario(2000.0);
		
		System.out.println("Valor do Bonus Diretor: "+rrf.getBonus());
		System.out.println("Valor do Bonus Gerente: "+saulo.getBonus());
		
	}	
	
}

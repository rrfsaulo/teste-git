package rrf.programas;

import rrf.modelo.Autenticavel;

public class Sistema_Interno {

	public void autentica(Autenticavel f) {
		
		int senha = 123;
		
		if(f.autentica(senha) == true){
			System.out.println(" Bem vindo ao Sistema");
		}
		else{
			System.out.println("Senha Incorreta");
		}
	}

	
}

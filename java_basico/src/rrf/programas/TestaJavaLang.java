package rrf.programas;

import rrf.modelo.Cliente;
import rrf.modelo.Conta;
import rrf.modelo.GuardadorDeObjetos;

public class TestaJavaLang {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(500.0, null, 0);
		Conta c2 = new Conta(500.0, null, 0);
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		
		armario.adiciona(c1);
		armario.adiciona(c2);
		
		Cliente joao = new Cliente();
		armario.adiciona(joao);
		
		Conta c1NoArmario = (Conta) armario.pega(0);
		Cliente joaoNoArmario = (Cliente) armario.pega(2);
		
		System.out.println(c1);
		
		if(c1.equals(joao)){
			System.out.println("São Iguais");			
		}else{
			System.out.println("São Diferentes");
		}
			
		
	}
}

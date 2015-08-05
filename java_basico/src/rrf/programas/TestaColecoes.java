package rrf.programas;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import rrf.modelo.Conta;

public class TestaColecoes {
	
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		
		nomes.add("Guilherme");
		
		for(String nome : nomes){
			System.out.println(nome);
		}
		
		
		Set<Conta> contas = new HashSet<Conta>();
		
		Conta c1 = new Conta(2500.0, "rrf", 222);
		Conta c2 = new Conta(200.0, "saulo", 645);
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.size());
		
		/*System.out.println(nomes.get(0));
		//System.out.println(nomes.contains("Guilherme"));
		
		for(String nome : nomes){
			System.out.println(nome);
		}
		Collections.sort(nomes);
		
		for(String nome : nomes){
			System.out.println(nome);
		}
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta(1500.0, "rrf", 123);
		Conta c2 = new Conta(700.0, "saulo", 222);
		
		contas.add(c1);
		contas.add(c2);
		
		Collections.sort(contas);
		
		for(Conta c : contas){
			System.out.println(c);
		}*/
		
		
		
		
		
		
		
	}
	

}

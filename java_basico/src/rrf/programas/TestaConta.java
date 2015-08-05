package rrf.programas;

import rrf.exceções.Saldo_Insuficiente_Exception;
import rrf.modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta joao = new Conta(400.5, "Mauricio Silva", 123);
		//joao.imprime();
		
		try {
			joao.saca(2250.0);
		}catch (Saldo_Insuficiente_Exception e) {
			System.out.println("Saldo esta Insuficiente :"+ e.getSaldoAtual());
		
		} catch (Exception e) {
			System.out.println("Um outro erro qualquer..");
		}
		
		
		System.out.println(joao.getSaldo());
		
	}
}

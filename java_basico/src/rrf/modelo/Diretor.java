package rrf.modelo;


public class Diretor extends Funcionario implements Autenticavel{

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return this.salario * 0.15;
	}

	
}

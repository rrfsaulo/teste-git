package rrf.modelo;


public class Gerente extends Funcionario implements Autenticavel {
	
	public double getBonus(){
		return this.salario * 0.3;
	}
	
	public void cobraEntrega(){
		System.out.println("Esta pronto?");
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

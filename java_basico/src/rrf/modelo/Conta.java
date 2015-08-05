package rrf.modelo;

//import javax.management.RuntimeErrorException;

public class Conta implements  Comparable<Conta>{
	protected double saldo;
	protected String nome;
	protected int agencia;
	
	/**
	 * 	Realiza um sac na conta dado um valor passado
	 * 
	 * @param Valor a ser sacado
	 * @param Excetion caso o saldo seja insuficiente
	 */
	public Conta(double saldo, String nome, int agencia) {
		this.saldo = saldo;
		this.nome = nome;
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void imprime() {
		
		System.out.println("agencia: "+agencia);
		System.out.println("saldo: "+saldo);
		System.out.println("nome: "+nome);
	}

	public void saca(double valor) throws Exception {
		// TODO Auto-generated method stub
		if(saldo >= valor){
			this.saldo -= valor;
		}
		else{
			//throw new Saldo_Insuficiente_Exception(saldo);
			throw new RuntimeException();
		}
	}
	
	@Override
	public String toString() {
		return "Conta com saldo: " +saldo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
		
	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}
		

}

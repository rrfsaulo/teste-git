package rrf.exceções;

public class Saldo_Insuficiente_Exception extends RuntimeException{
	
	protected final double saldoAtual;
	
	public Saldo_Insuficiente_Exception(double saldoAtual){
		super("Saldo Insuficiente: "+ saldoAtual);
		this.saldoAtual = saldoAtual;		
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
	
}

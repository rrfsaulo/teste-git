package rrf.exce��es;

public class Saldo_Insuficiente_Exception extends RuntimeException{
	
	protected final double saldoAtual;
	
	public Saldo_Insuficiente_Exception(double saldoAtual){
		super("Saldo Insuficiente: "+ saldoAtual);
		this.saldoAtual = saldoAtual;		
	}
	
	public Saldo_Insuficiente_Exception() {
		this.saldoAtual = 0;	
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
	
}

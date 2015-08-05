package rrf.modelo;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	private int senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonus();
	
	public boolean autentica(int senha){
		return this.senha == senha;
	}
	
}

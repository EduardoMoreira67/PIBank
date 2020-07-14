package Model; 
/* 
  * Neste caso, criamos um novo tipo de dado "Conta Especial" que amplia o conceito de Conta, 
  * ou seja, Conta Especial tem tudo o que Conta tem, mais suas particularidades (neste caso, o Limite) 
  *  
  * Como se d� esse v�nculo? Atrav�s da palavra reservada EXTENDS 
  *  
  * Ok, mas como a Conta Especial acessa os atributos declarados em CONTA? 
  * 		Tornando-os com acesso PROTECTED na classe Conta 
*/ 
public class ContaEspecial extends Conta { 
// defino os atributos que s�o exclusivos de conta especial 
	private double limite; 
 	 
/* Regra de ouro: se uma clase Pai tem construtor DECLARADO, a classe Filha � OBRIGADA a tamb�m ter 
 * construtor e, ainda por cima, a 1a linha do construtor da CLASSE FILHA � CHAMAR O CONSTRUTOR DA CLASSE PAI 
 * atrav�s da palavra reservada SUPER 
 */ 
   public ContaEspecial(String nome, String cpf, int numConta, double saldo, double limite) { 
 		super(nome, cpf, numConta, saldo); 
 		this.limite = limite; 
 	} 
 
 
 	/* vou redefinir a l�gica do debitar. Aqui na conta especial, para debitar um valor 
 	 * � necess�rio levar em conta o saldo (declarado na classe Pai) e o limite (declarado na classe Filha) 
 	 *  
 	 */ 
 	public boolean debitar(double valor) { 
 		if (valor <= super.saldo + this.limite) { 
 			super.saldo -= valor; 
 			return true; 
 		} 
 		else { 
 			return false; 
 		} 
 	} 
 	 
 	public double getLimite() { 
 		return limite; 
 	} 
 
 
 	public void setLimite(double limite) { 
 		this.limite = limite; 
 	} 
 	 
 	public String exibirInfo() { 
 		return "Conta Especial "+super.numeroConta+"  Saldo R$ "+super.saldo+ 
 				"  Limite R$ "+this.limite+ 
 				"\nTitular: "+super.nomeTitular+" / "+super.cpf; 
 	} 
 	 
 	 
 
 
} 

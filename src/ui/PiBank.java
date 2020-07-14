package ui; 

import Model.Conta; 
import Model.ContaEspecial; 
 

public class PiBank { 
 	public static void main(String args[]) { 
 		Conta c1; 
 		ContaEspecial c2; 
 		 
 		c1 = new Conta("Isidro", "123.456.789-00", 12345, 200);		 
		c2 = new ContaEspecial("Jose", "987.654.321-00",9876,200, 1000); 
 
 
 		 
 		 
	 
 		 
 		System.out.println(c1.exibirInfo()); 
 		System.out.println(c2.exibirInfo()); 
 		 
		System.out.println(""); 
 		if (c1.debitar(400)) { 
 			System.out.println("Debito na conta "+c1.getNumeroConta()+" efetuado"); 
 		} 
 		else { 
			System.out.println("Saldo insuficiente na conta "+c1.getNumeroConta()); 
 		} 
 		 
 		if (c2.debitar(400)) { 
 			System.out.println("Debito na conta "+c2.getNumeroConta()+" efetuado"); 
 		} 
 		else { 
 			System.out.println("Saldo insuficiente na conta "+c2.getNumeroConta()); 
 		} 
 		System.out.println(""); 
 		 
 		System.out.println(c1.exibirInfo()); 
 		System.out.println(c2.exibirInfo()); 
 		 
 		 
 
 
 	     
 	} 
 
}
  

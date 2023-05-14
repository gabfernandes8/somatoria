package br.senai.sp.jandira;

public class Somatoria {

	public static void main(String[] args) {
		
		int par, soma = 0;
			
		System.out.println("Aqui estão os números pares entre 1 e 50:");
		System.out.println("");
		
		for (int numero = 0; numero <= 50; numero++) {
			
			if (numero % 2 == 0) {
				
				soma += numero;
				par = numero;
				System.out.println(par);				
			}
		}
		System.out.println("");
		System.out.println("A soma dos números é: " +soma);
	}

}

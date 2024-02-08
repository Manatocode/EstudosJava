package estudos;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Scanner soma  = new Scanner(System.in);
		
		 System.out.println("Digite os três valores separados por espaço:");
	        String entrada = soma.nextLine();
	        
	        String[] valores = entrada.split(" ");
	        
	        double valor1 = Double.parseDouble(valores[0]);
	        double valor2 = Double.parseDouble(valores[1]);
	        double valor3 = Double.parseDouble(valores[2]);
	        
	        
	        double maior = Math.max(valor1, Math.max(valor2, valor3));


	        System.out.println(maior + " eh o maior");

	        soma.close();
		
		
		
	}

}

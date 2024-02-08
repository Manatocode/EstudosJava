package estudos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Digite os dois primeiros números X e Y: ");
		String entrada = numero.nextLine();		
		String[] valores = entrada.split(" ");
		
		double x1 = Double.parseDouble(valores[0]);
		double y1 = Double.parseDouble(valores[1]);
		
		System.out.println("Digite os dois segundos números X e Y: ");
		String entrada2 = numero.nextLine();		
		String[] valores2 = entrada2.split(" ");
		
		double x2 = Double.parseDouble(valores2[0]);
		double y2 = Double.parseDouble(valores2[1]);
		
		
		double raiz = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		DecimalFormat df = new DecimalFormat();
		 df.setMaximumFractionDigits(4);
		 String distanciaformatada = df.format(raiz);
		
		
		System.out.println("A distância é " + distanciaformatada);
		
		
		
	}

}

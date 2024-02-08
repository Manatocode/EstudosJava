package estudos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsumoGasolina {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantas horas de viagem: ");
		int horas = leitor.nextInt();
		System.out.println("Qual velocidade média: ");
		int velocidadeM = leitor.nextInt();
		
		double quilometros = horas * velocidadeM;
		
		double quilometrosM = quilometros/12;
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(3);
		String formatada = df.format(quilometrosM);
		
		System.out.println(formatada);
	
	}
}

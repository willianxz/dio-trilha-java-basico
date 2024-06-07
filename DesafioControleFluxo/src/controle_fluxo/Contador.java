package controle_fluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
	Scanner terminal = new Scanner(System.in);
	terminal.useLocale(Locale.US);
	
	System.out.println("Digite o primeiro parâmetro: ");
	int parametroUm = terminal.nextInt();
	
	System.out.println("Digite o segundo parâmetro");
	int parametroDois = terminal.nextInt();
	
	terminal.close();
	
	try {
		contar(parametroUm, parametroDois);
	} catch(ParametrosInvalidosException e){
		System.out.println("O segundo parâmetro deve ser maior do que o primeiro.");
	}
	
}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		System.out.println("Processando a contagem dos numeros....");
		for(int contador = 0; contador < contagem; contador++) {
			System.out.println("numero...." + (contador+1));			
		}
		System.out.println("CONTAGEM FINALIZADA.");
	}
}

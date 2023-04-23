package poligono__if;

import java.util.Scanner;

public class CalcularPoligono {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int numLados;		
		double medidaLado, area;
		
		System.out.println("Digite o número de lados do polígono: ");
		numLados = in.nextInt();
		
		if (numLados < 3 ){
			System.out.println("NÃO É UM POLÍGONO.");
			System.exit(0); // Encerra o programa aqui
		} else if (numLados > 5){
			System.out.println("POLÍGONO NÃO IDENTIFICADO.");
			System.exit(0); // Encerra o programa aqui
		}
		
		System.out.println("Digite a medida do lado do polígono em 'cm': ");
		medidaLado = in.nextDouble();
		
		
		if (numLados == 3) {
            area = (medidaLado * medidaLado * Math.sqrt(3)) / 4; // Área do triângulo equilátero
			System.out.printf("Este polígono é um TRIÂNGULO. Área: %2f cm²", area);
		} else if (numLados == 4) {
            area = medidaLado * medidaLado; // Área do quadrado
			System.out.printf("Este polígono é um QUADRADO. Área: %.2f cm²", area);
		}else if (numLados == 5) {
	        area = (1.720477 * medidaLado * medidaLado); // Área do pentágono
			System.out.printf("Este polígono é um PENTÁGONO. Área: %.2f cm²", area);
	} 
		in.close();
	}
}

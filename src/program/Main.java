package program;

/*
beecrowd | 1101 - Sequência de Números e Soma

Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		while ((x = sc.nextInt()) > 0 && (y = sc.nextInt()) > 0) {

			int soma = 0;

			if (y > x) {
				int aux = x;
				x = y;
				y = aux;
			}

			for (int i = y; i <= x; i++) {
				System.out.printf("%d ", i);
				soma += i;
			}
			System.out.printf("Sum=%d\n", soma);
		}
		sc.close();
	}
}

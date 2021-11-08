package banco;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		ContaBanco minhaConta = new ContaBanco();
		Scanner leitura = new Scanner(System.in);
		String nome;
		int op;
		float saldo, valor;
		do {
			System.out.println("-----Conta Bancaria-----");
			System.out.println("1- Inserir dados:");
			System.out.println("2- Mostrar dados");
			System.out.println("3- Depositar valor");
			System.out.println("4- Sacar valor");
			System.out.println("5- Mostrar saldo");
			System.out.println("0 - Sair");
			
			op = leitura.nextInt();
		
			switch (op) {

			case 1:
			
				System.out.println("Entre com o nome:");
				nome = leitura.nextLine();
				leitura.next();
				
				System.out.println("Entre com o saldo: ");
				saldo = leitura.nextFloat();
				
				minhaConta.inseredados(nome, gerador.nextInt(9999), saldo);

				break;
			case 2:
				minhaConta.mostrardado();
				break;
			case 3:
				System.out.println("Entre com o valor a ser depositado: ");
				valor = leitura.nextFloat();
				minhaConta.deposita(valor);
				break;
			case 4:
				minhaConta.mostrarsal();
				System.out.println("Entre com o valor a ser sacado: ");
				valor = leitura.nextFloat();
				minhaConta.saca(valor);
				break;
			case 5:
				minhaConta.mostrarsal();
				break;
			}
		} while (op != 0);
		leitura.close();
	}
}

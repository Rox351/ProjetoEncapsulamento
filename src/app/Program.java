package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		
		System.out.println("Digite o seu nome: ");
		p1.nome = input.nextLine();
	}

}

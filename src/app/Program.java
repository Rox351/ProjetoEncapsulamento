package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		
		System.out.println("Digite o seu nome: ");
		p1.nome = input.nextLine();
		
		System.out.println("Digite a sua idade: ");
		p1.setIdade(input.nextInt());
		
		System.out.println("Digite o seu peso: ");
		p1.setPeso(input.nextDouble());
		
		System.out.println("*****VISUALIZANDO OS DADOS*****");
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Peso: " + p1.getPeso());
		
		input.close();
	}

}

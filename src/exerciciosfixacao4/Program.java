package exerciciosfixacao4;

import java.util.Scanner;

import entities.Usuario;


public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Usuario user1;
				
		System.out.println("Informe o numero da conta:");
		int numConta = sc.nextInt();
		System.out.println("Seu nome completo:");
		String nome = sc.next();
		
		System.out.println("vai haver um deposito inicial? ");
		char yesno = sc.next().charAt(0);		
		
		if (yesno == 'y') {
			System.out.println("Qual valor incial voce deseja depositar? ");
			double depositoInicial = sc.nextDouble();
			user1 = new Usuario(numConta, nome, depositoInicial);
		}
		
		else {
			user1 = new Usuario(numConta, nome);
		}
		
		System.out.println("Account data:");
		System.out.println(user1.toString());
		
		System.out.println("Enter deposit value:");
		user1.depositaValor(sc.nextDouble());
		System.out.println("Update Account data:");
		System.out.println(user1.toString());
		
		System.out.println("Enter withdraw value:");
		user1.retiraValor(sc.nextDouble());
		System.out.println("Update Account data:");
		System.out.println(user1.toString());
			
		sc.close();
		
	}

}

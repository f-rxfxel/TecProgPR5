package periodo3;

import java.util.*;

public class Main {
    
	static Scanner input = new Scanner(System.in);
	static ArrayList<Aluno> students = new ArrayList<Aluno>();
	
    public static void main(String[] args) {
    	
    	int option;
    	
	     do {
	    	 System.out.print("-= Alunos de Pós e Mestrado =-\n"
	    			+ "1 - Cadastro de Alunos\n"
	    	 		+ "2 - Listagem - Mestrado\n"
	    	 		+ "3 - Listagem - Pós-graduação\n"
	    	 		+ "4 - Sair\n"
	    	 		+ "> ");
	        	 
	        option = input.nextInt();
	        
	        switch (option) {
	        case 1:
	        	addAluno();
	        	break;
	        case 2:
	        	System.out.println(printMestrado());
	        	break;
	        case 3:
	        	System.out.println(printPosG());
	        	break;
	        	case 4:
	        	System.out.println("Programa finalizado!");
	        	System.exit(0);
	        default:
	        	System.out.println("Opção inválida! Tente novamente:");
	        	}
	     } while (true);
    	
    }

	private static void addAluno() {
		
		Aluno a = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		a.setNome(input.next());
		
		System.out.println("Digite o email do aluno: ");
		a.setEmail(input.next());
		
		System.out.println("Digite o CPF do aluno: ");
		a.setCpf(input.nextInt());
		
		if(alreadyExists(a.getCpf())) {
			System.out.println("Este aluno já foi cadastrado!\n");
		} else {
			
			do {
				System.out.printf("O aluno está:\n"
						+ "1 - Pós-graduando\n"
						+ "2 - Mestrando\n"
						+ "> ");
				int option = input.nextInt();
				
				if(option == 1) {
					System.out.println("Aluno " + a.getNome() + " pós-graduando!");
					
					System.out.println("Aluno " + a.getNome() + " cadastrado!\n");
					students.add(a);
					break;
					
				} else if(option == 2){
					System.out.println("Aluno " + a.getNome() + " mestrando!");
					
					a.setEstaMestrando(true);
					System.out.println("Aluno " + a.getNome() + " cadastrado!\n");
					students.add(a);
					break;
					
				} else {
					System.out.println("Opção inválida!");
				}
			} while(true);
			
		}
		
	}

	private static boolean alreadyExists(int cpf) {
		
		for(Aluno student : students) {
			return student.getCpf() == cpf;
		}
		return false;
	}
	
	private static String printMestrado() {
		
		if(students.isEmpty()) {
			return "Adicione ao menos um aluno antes!\n";
		}
		
		for (Aluno student : students) {
			if(student.isEstaMestrando()) {
				System.out.println(student.toString());
			}
		}
		
		return "~ Fim da listagem dos mestrandos.\n";
		
	}
	
	private static String printPosG() {
		
		if(students.isEmpty()) {
			return "Adicione ao menos um aluno antes!\n";
		}
		
		for (Aluno student : students) {
			if(!student.isEstaMestrando()) {
				System.out.println(student.toString());
			}
		}
		
		return "~ Fim da listagem dos pós-graduando.\n";
		
	}
}

package view;

import java.util.Scanner;
import controller.Programa;

public class Menu {

    public static void menuCadastro() {

        Programa metodos = new Programa();
        Scanner sc = new Scanner(System.in);
        boolean programaEncerra = true;

        while (programaEncerra) {
            System.out.println("\n||    MENU DE OPÇÕES  ||\n");
            System.out.println("Escolha umas das opções a seguir:\n");
            System.out.println("Opção 1 - Cadastrar nova Pessoa ou Aluno");
            System.out.println("Opção 2 - Exibir Pessoas e Alunos cadastrados");
            System.out.println("Opção 3 - Atualizar Cadastro de Pessoa ou Aluno");
            System.out.println("Opção 4 - Remover Cadastro de Pessoa ou Aluno");
            System.out.println("Opção 5 - Encerrar o Programa\n");

            String escolha = sc.nextLine();

            switch (escolha) {
                case "1":
                    metodos.cadastrar();
                    break;
                case "2":
                    metodos.exibirCadastros();
                    break;
                case "3":
                    metodos.atualizarCadastro();
                    break;
                case "4":
                    metodos.removerCadastro();
                    break;
                case "5":
                    programaEncerra = false;
                    metodos.encerrarPrograma();
                    break;
                default:
                    System.out.println("\nOpção inválida. Insira uma opção válida\n");
                    break;
            }
        }
    }

}

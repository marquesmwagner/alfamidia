package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Aluno;
import model.Pessoa;
import view.Menu;

public class Programa {

    Scanner sc = new Scanner(System.in);
    static List<Pessoa> pessoasCadastradas = new ArrayList<>();
    static List<Aluno> alunosCadastrados = new ArrayList<>();

    public void cadastrar() {
        System.out.println("\nDigite o nome:");
        String nome = sc.nextLine();
        System.out.println("\nDigite o telefone:");
        String telefone = sc.nextLine();
        System.out.println("\nDigite a data de nascimento:");
        String dataNascimento = sc.nextLine();
        System.out.println("\nEntre com a nota final se for um aluno. Se for uma pessoa entre com 0:");
        double notaFinal = sc.nextDouble();
        sc.nextLine();
        LocalDate dataCadastro = LocalDate.now();
        LocalDate dataAlteracao = LocalDate.now();

        if (notaFinal != 0.0) {
            Aluno aluno = new Aluno(nome, telefone, dataNascimento, dataCadastro, dataAlteracao, notaFinal);
            alunosCadastrados.add(aluno);
        } else {
            Pessoa pessoa = new Pessoa(nome, telefone, dataNascimento, dataCadastro, dataAlteracao);
            pessoasCadastradas.add(pessoa);
        }

    }

    public void exibirCadastros() {
        System.out.println("\nPessoas cadastras:");
        if (pessoasCadastradas.size() == 0) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.println(pessoasCadastradas.toString().replace("[", "").replace("]", "").replace(",", "")
                    .replace(" Nome", "Nome"));
        }
        System.out.println("\nAlunos cadastrados:");
        if (alunosCadastrados.size() == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println(alunosCadastrados.toString().replace("[", "").replace("]", "").replace(",", "")
                    .replace(" Nome", "Nome"));
        }

    }

    public void atualizarCadastro() {
        System.out.println("\nAtualizar cadastro:");
        System.out.println("\nOpção 1 - Pessoa");
        System.out.println("Opção 2 - Aluno");
        System.out.println("Opção 3 - Voltar ao Menu\n");
        String opcao = sc.nextLine();
        int index = -1;

        if (opcao.equals("1")) {
            System.out.println("\nDigite o nome da Pessoa a ser atualizada:");
            String nome = sc.nextLine();

            for (Pessoa p : pessoasCadastradas) {
                if (p.getNome().equals(nome)) {
                    index = pessoasCadastradas.indexOf(p);
                }
            }

            if (index == -1) {
                System.out.println("\nNome não encontrado. Insira um nome válido.");
                System.out.println("Voltar ao menu? (S/N)\n");
                String op = sc.nextLine();
                if (op.equals("s") || op.equals("S")) {
                    Menu.menuCadastro();
                }
                atualizarCadastro();
            }

            System.out.println("\nDigite o nome:");
            pessoasCadastradas.get(index).setNome(sc.nextLine());
            System.out.println("\nDigite o telefone:");
            pessoasCadastradas.get(index).setTelefone(sc.nextLine());
            System.out.println("\nDigite a data de nascimento:");
            pessoasCadastradas.get(index).setDataNascimento(sc.nextLine());
            // Data de cadastro pode ser modificada?
            pessoasCadastradas.get(index).setDataAlteracao(LocalDate.now());
            System.out.println("\nCadastro de Pessoa atualizado com sucesso!");

        } else if (opcao.equals("2")) {
            System.out.println("\nDigite o nome do aluno a ser atualizado:");
            String nome = sc.nextLine();

            for (Aluno a : alunosCadastrados) {
                if (a.getNome().equals(nome)) {
                    index = alunosCadastrados.indexOf(a);
                }
            }

            if (index == -1) {
                System.out.println("\nNome não encontrado. Insira um nome válido.");
                System.out.println("Voltar ao menu? (S/N)\n");
                String op = sc.nextLine();
                if (op.equals("s") || op.equals("S")) {
                    Menu.menuCadastro();
                }
                atualizarCadastro();
            }

            System.out.println("\nDigite o nome:");
            alunosCadastrados.get(index).setNome(sc.nextLine());
            System.out.println("\nDigite o telefone:");
            alunosCadastrados.get(index).setTelefone(sc.nextLine());
            System.out.println("\nDigite a data de nascimento:");
            alunosCadastrados.get(index).setDataNascimento(sc.nextLine());
            System.out.println("\nEntre com a nota final:");
            alunosCadastrados.get(index).setNotaFinal(sc.nextDouble());
            sc.nextLine();
            // Data de cadastro pode ser modificada?
            pessoasCadastradas.get(index).setDataAlteracao(LocalDate.now());
            System.out.println("\nCadastro de Aluno atualizado com sucesso!");

        } else if (opcao.equals("3")) {
            Menu.menuCadastro();
        } else {
            System.out.println("\nOpção inválida. Insira uma opção válida.");
            atualizarCadastro();
        }

    }

    public void removerCadastro() {
        System.out.println("\nRemover cadastro:");
        System.out.println("\nOpção 1 - Pessoa");
        System.out.println("Opção 2 - Aluno");
        System.out.println("Opção 3 - Voltar ao Menu\n");
        String opcao = sc.nextLine();
        int index = -1;

        if (opcao.equals("1")) {
            System.out.println("\nDigite o nome da Pessoa a ser removida:");
            String nome = sc.nextLine();

            for (Pessoa p : pessoasCadastradas) {
                if (p.getNome().equals(nome)) {
                    index = pessoasCadastradas.indexOf(p);
                }
            }

            if (index == -1) {
                System.out.println("\nNome não encontrado. Insira um nome válido.");
                System.out.println("Voltar ao menu? (S/N)\n");
                String op = sc.nextLine();
                if (op.equals("s") || op.equals("S")) {
                    Menu.menuCadastro();
                }
                removerCadastro();
            }

            pessoasCadastradas.remove(index);
            System.out.println("\nPessoa removida com sucesso!");

        } else if (opcao.equals("2")) {
            System.out.println("\nDigite o nome do aluno a ser atualizado:");
            String nome = sc.nextLine();

            for (Aluno a : alunosCadastrados) {
                if (a.getNome().equals(nome)) {
                    index = alunosCadastrados.indexOf(a);
                }
            }

            if (index == -1) {
                System.out.println("\nNome não encontrado. Insira um nome válido.");
                System.out.println("Voltar ao menu? (S/N)\n");
                String op = sc.nextLine();
                if (op.equals("s") || op.equals("S")) {
                    Menu.menuCadastro();
                }
                removerCadastro();
            }

            alunosCadastrados.remove(index);
            System.out.println("\nAluno removido com sucesso!");

        } else if (opcao.equals("3")) {
            Menu.menuCadastro();
        } else {
            System.out.println("\nOpção inválida. Insira uma opção válida.");
            removerCadastro();
        }

    }

    public void encerrarPrograma() {
        System.out.println("\nPrograma encerrado.");

    }

    public static void iniciarPrograma() {
        Menu.menuCadastro();
    }

}

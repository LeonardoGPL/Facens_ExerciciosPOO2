/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exerc02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leogo
 */
public class Exerc02 {

    public static void main(String[] args) {
        int opcao = 0;
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        Disciplina d = new Disciplina();
        Professor p = new Professor();
        Atedente a = new Atedente();
        Aluno n = new Aluno();

        Scanner bat = new Scanner(System.in);
        while (opcao != 7) {
            System.out.println("----Menu----");
            System.out.println("1 - Inserir Disciplina");
            System.out.println("2 - Inserir Professor");
            System.out.println("3 – Inserir Atendente");
            System.out.println("4 – Inserir Aluno");
            System.out.println("5 – Adicionar Disciplina ao Professor");
            System.out.println("6 – Mostrar Pessoas ");
            System.out.println("7 – Sair");
            System.out.println("Escolha a opcão desejada:");
            opcao = Integer.parseInt(bat.next());
            switch (opcao) {
                case 1://Inserir Disciplina
                    System.out.println("Digite o Codigo da Disciplina");
                    d.setCodigo(bat.nextInt());
                    System.out.println("Digite o Nome da Disciplina");
                    d.setNome(bat.next());

                    break;
                case 2://Inserir Professor
                    System.out.println("Digite a URL do Curriculo no Lattes");
                    p.setUrlCurriculoLattes(bat.next());
                    System.out.println("Digite o Numero do Cracha");
                    p.setNumeroCracha(bat.nextInt());
                    System.out.println("Digite o Salario");
                    p.setSalario(bat.nextDouble());
                    System.out.println("Digite o Nome");
                    p.setNome(bat.next());
                    System.out.println("Digite o Numero do cpf");
                    p.setCpf(bat.next());
                    pessoa.add(p);
                    break;
                case 3://Inserir Atedente 
                    System.out.println("Digite o Setor");
                    a.setSetor(bat.next());
                    System.out.println("Digite a Funcao");
                    a.setFuncao(bat.next());
                    System.out.println("Digite o Numero do Cracha");
                    a.setNumeroCracha(bat.nextInt());
                    System.out.println("Digite o Salario");
                    a.setSalario(bat.nextDouble());
                    System.out.println("Digite o Nome");
                    a.setNome(bat.next());
                    System.out.println("Digite o CPF");
                    a.setCpf(bat.next());
                    pessoa.add(a);
                    break;
                case 4://Inserir Aluno
                    System.out.println("Digite o ra");
                    n.setRa(bat.next());
                    System.out.println("Digite o Curso");
                    n.setCurso(bat.next());
                    System.out.println("Digite o Nome");
                    n.setNome(bat.next());
                    System.out.println("Digite o CPF");
                    n.setCpf(bat.next());
                    pessoa.add(n);
                    break;
                case 5:
                    System.out.println("Digite a Disciplina para o Professor");
                    p.addDiciplina(d);
                    System.out.println("A disciplina " + d.getNome() + " Foi adicionada ao Professor " + p.getNome());
                    break;
                case 6:
                    for (Pessoa Pessoa : pessoa) {
                        System.out.println(p.toString());
                    }
                    break;
                case 7:

                    System.out.println("O Sistema Sera Fechado! ");
                    break;
                default:
                    System.out.println("Opcao Invalida!");

            }
            
        }
        bat.close();
    }
}

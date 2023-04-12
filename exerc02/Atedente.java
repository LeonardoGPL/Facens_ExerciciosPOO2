/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exerc02;

/**
 *
 * @author leogo
 */
public class Atedente extends Funcionario {
    private String setor;
    private String funcao;

    public Atedente() {
    }

    public Atedente(String setor, String funcao, int numeroCracha, double salario, String nome, String cpf) {
        super(numeroCracha, salario, nome, cpf);
        this.setor = setor;
        this.funcao = funcao;
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Atedente" + "\nsetor = " + setor + "\nfuncao = " + funcao + "\n Numero do Cracha = " + this.getNumeroCracha() + "\nsalario = " + this.getSalario() + "\n nome = " + this.getNome() + "\ncpf = " + this.getCpf();
    }

    
     
    
    
}

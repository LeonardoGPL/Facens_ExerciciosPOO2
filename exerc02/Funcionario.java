/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exerc02;

/**
 *
 * @author leogo
 */
public class Funcionario extends Pessoa {

    @Override
    public String toString() {
        return "Funcionario" + "\n numero do Cracha = " + numeroCracha + "\nsalario = " + salario + "\n nome = " + this.getNome() + "\ncpf = " + this.getCpf();
    }

    
    private int numeroCracha;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int numeroCracha, double salario, String nome, String cpf) {
        super(nome, cpf);
        this.numeroCracha = numeroCracha;
        this.salario = salario;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
    
   
    
}

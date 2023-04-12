/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exerc02;

/**
 *
 * @author leogo
 */
public class Aluno extends Pessoa {
    private String ra;
    private String curso;

    public Aluno() {
    }

    public Aluno(String ra, String curso, String nome, String cpf) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno" + "\n ra = " + ra + "\ncurso = " + curso + "\nnome = " + this.getNome() + "\ncpf = " + this.getCpf();
    }

   
    
    
}

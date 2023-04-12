/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exerc02;

import java.util.ArrayList;

/**
 *
 * @author leogo
 */
public class Professor extends Funcionario{
   private String urlCurriculoLattes;
   private ArrayList<Disciplina> disciplinas = new ArrayList();

    public Professor() {
    }

    public Professor(String urlCurriculoLattes, int numeroCracha, double salario, String nome, String cpf) {
        super(numeroCracha, salario, nome, cpf);
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    @Override
    public String toString() {
        return "Professor" + "\n url do Curriculo Lattes = " + urlCurriculoLattes + "\n disciplina = " + disciplinas + "\n Numero do Cracha = " + this.getNumeroCracha() + "\nsalario = " + this.getSalario() + "\n nome = " + this.getNome() + "\ncpf = " + this.getCpf();
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addDiciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void removeDisciplina(int index){
       disciplinas.remove(index);
    }
    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    public Disciplina getDisciplina(int index){
            return disciplinas.get(index);
    }
    
}


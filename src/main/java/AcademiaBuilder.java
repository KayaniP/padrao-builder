package src.main.java;

import java.util.Date;

public class AcademiaBuilder{

    private Academia academia;

    public AcademiaBuilder(){
        academia = new Academia();
    }
    
    public Academia build(){
        if (academia.getMatricula() == 0){
            throw new IllegalArgumentException("Matricula Inválida");
        }
        if (academia.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido");
        }
        return academia;
    }
    public AcademiaBuilder setDataNascimento(Date dataNascimento) {
        academia.setDataNascimento(dataNascimento);
        return this;
    }
    public AcademiaBuilder setMatricula(int matricula){
        academia.setMatricula(matricula);
        return this;
    }
    public AcademiaBuilder setNome(String nome) {
        academia.setNome(nome);
        return this;
    }
    public AcademiaBuilder setCpf(String cpf) {
        academia.setCpf(cpf);
        return this;
    }
    public AcademiaBuilder setCelular(String celular) {
        academia.setCelular(celular);
        return this;
    }
    public AcademiaBuilder setComorbidade(String comorbidade) {
        academia.setComorbidade(comorbidade);
        return this;
    }

}
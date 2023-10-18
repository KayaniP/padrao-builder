package src.main.java;

import java.util.Date; //inicializa o objeto com a data e hora atuais

public class Academia {

    private int matricula;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String celular;
    private String comorbidade;

    public Academia(){
        this.matricula = 0; 
        this.nome = "";
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getNome(){
        return nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getComorbidade(){
        return comorbidade;
    }
    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }
    }



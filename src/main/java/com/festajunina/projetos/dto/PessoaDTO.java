package com.festajunina.projetos.dto;
import com.festajunina.projetos.domain.Pessoa;

public class PessoaDTO {
    Long id;
    String nome;
    String situacao;

    public PessoaDTO(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public PessoaDTO(Long id, String nome, String situacao) {
        this.id = id;
        this.nome = nome;
        this.situacao = situacao;
    }
    public PessoaDTO(Pessoa pessoa) {
        id = pessoa.getId();
        nome = pessoa.getNome();
        situacao = pessoa.getSituacao();
    }
}

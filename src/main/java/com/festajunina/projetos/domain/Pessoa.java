package com.festajunina.projetos.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table (name = "tb_pessoa")
@Data

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String situacao;

    public Pessoa(List<Comida> comidas) {
        this.comidas = comidas;
    }

    @OneToMany(mappedBy = "pessoa" )
    private List<Comida> comidas;

        public Pessoa() {
           }

    public Pessoa(Long id, String nome, String situacao) {
        this.id = id;
        this.nome = nome;
        this.situacao = situacao;
    }

    public Pessoa( String nome) {
        this.nome = nome;
        this.situacao = "Pendente";
    }
    public Pessoa(Long id, String nome, Boolean paid) {
        this.id = id;
        this.nome = nome;

    }
    public Pessoa(Object o, String nome) {
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

    public void setPaid(Boolean paid) {
          }
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    public void setComidas() {
        this.comidas = comidas;
    }
}





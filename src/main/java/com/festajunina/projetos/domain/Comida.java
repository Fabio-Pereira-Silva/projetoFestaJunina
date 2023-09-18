package com.festajunina.projetos.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_comida")
@Data
@NoArgsConstructor

public class Comida {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     Long id;
     String nome;

     @JsonIgnore
     @ManyToOne
     @JoinColumn(name = "pessoa_id",referencedColumnName = "id")
     private Pessoa pessoa;

    public Comida(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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
}

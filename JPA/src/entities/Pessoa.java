/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author Antonio
 */
  
@Entity

public class Pessoa implements Serializable {
    
    @EmbeddedId
    private IdPessoa id;
    //@Column(name = "p_nome") caso o nome da coluna esteja diferente do banco de dados
    private String nome;
    private String sobrenome;

    public Pessoa() {
    }

    public IdPessoa getId() {
        return id;
    }

    public void setId(IdPessoa id) {
        this.id = id;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
    
}

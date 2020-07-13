package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "senha", nullable = false)
    private String senha;

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSenha(final String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

}
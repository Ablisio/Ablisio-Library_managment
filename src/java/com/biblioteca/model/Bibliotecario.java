/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ablisio
 */
@Entity
@Table(name = "bibliotecario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bibliotecario.findAll", query = "SELECT b FROM Bibliotecario b")
    , @NamedQuery(name = "Bibliotecario.findByBibliotecarioId", query = "SELECT b FROM Bibliotecario b WHERE b.bibliotecarioId = :bibliotecarioId")
    , @NamedQuery(name = "Bibliotecario.findByNome", query = "SELECT b FROM Bibliotecario b WHERE b.nome = :nome")
    , @NamedQuery(name = "Bibliotecario.findByEndereco", query = "SELECT b FROM Bibliotecario b WHERE b.endereco = :endereco")
    , @NamedQuery(name = "Bibliotecario.findByEmail", query = "SELECT b FROM Bibliotecario b WHERE b.email = :email")
    , @NamedQuery(name = "Bibliotecario.findByTelefone", query = "SELECT b FROM Bibliotecario b WHERE b.telefone = :telefone")
    , @NamedQuery(name = "Bibliotecario.findByDataContratacao", query = "SELECT b FROM Bibliotecario b WHERE b.dataContratacao = :dataContratacao")
    , @NamedQuery(name = "Bibliotecario.findBySenha", query = "SELECT b FROM Bibliotecario b WHERE b.senha = :senha")})
public class Bibliotecario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "bibliotecario_id")
    private Integer bibliotecarioId;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "endereco")
    private String endereco;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 20)
    @Column(name = "telefone")
    private String telefone;
    @Size(max = 255)
    @Column(name = "data_contratacao")
    private String dataContratacao;
    @Size(max = 255)
    @Column(name = "senha")
    private String senha;

    public Bibliotecario() {
    }

    public Bibliotecario(Integer bibliotecarioId) {
        this.bibliotecarioId = bibliotecarioId;
    }

    public Integer getBibliotecarioId() {
        return bibliotecarioId;
    }

    public void setBibliotecarioId(Integer bibliotecarioId) {
        this.bibliotecarioId = bibliotecarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bibliotecarioId != null ? bibliotecarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bibliotecario)) {
            return false;
        }
        Bibliotecario other = (Bibliotecario) object;
        if ((this.bibliotecarioId == null && other.bibliotecarioId != null) || (this.bibliotecarioId != null && !this.bibliotecarioId.equals(other.bibliotecarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.biblioteca.controller.Bibliotecario[ bibliotecarioId=" + bibliotecarioId + " ]";
    }
    
}

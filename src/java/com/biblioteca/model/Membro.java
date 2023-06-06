/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ablisio
 */
@Entity
@Table(name = "membro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Membro.findAll", query = "SELECT m FROM Membro m")
    , @NamedQuery(name = "Membro.findByMembroId", query = "SELECT m FROM Membro m WHERE m.membroId = :membroId")
    , @NamedQuery(name = "Membro.findByNome", query = "SELECT m FROM Membro m WHERE m.nome = :nome")
    , @NamedQuery(name = "Membro.findByEndereco", query = "SELECT m FROM Membro m WHERE m.endereco = :endereco")
    , @NamedQuery(name = "Membro.findByEmail", query = "SELECT m FROM Membro m WHERE m.email = :email")
    , @NamedQuery(name = "Membro.findByTelefone", query = "SELECT m FROM Membro m WHERE m.telefone = :telefone")
    , @NamedQuery(name = "Membro.findByDataInscricao", query = "SELECT m FROM Membro m WHERE m.dataInscricao = :dataInscricao")
    , @NamedQuery(name = "Membro.findBySenha", query = "SELECT m FROM Membro m WHERE m.senha = :senha")
    , @NamedQuery(name = "Membro.findByCodigo", query = "SELECT m FROM Membro m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "Membro.findByCurso", query = "SELECT m FROM Membro m WHERE m.curso = :curso")})
public class Membro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "membro_id")
    private Integer membroId;
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
    @Column(name = "data_inscricao")
    private String dataInscricao;
    @Size(max = 255)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private int codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "curso")
    private String curso;
    @OneToMany(mappedBy = "membroId")
    private Collection<Emprestimo> emprestimoCollection;

    public Membro() {
    }

    public Membro(Integer membroId) {
        this.membroId = membroId;
    }

    public Membro(Integer membroId, int codigo, String curso) {
        this.membroId = membroId;
        this.codigo = codigo;
        this.curso = curso;
    }

    public Integer getMembroId() {
        return membroId;
    }

    public void setMembroId(Integer membroId) {
        this.membroId = membroId;
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

    public String getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(String dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @XmlTransient
    public Collection<Emprestimo> getEmprestimoCollection() {
        return emprestimoCollection;
    }

    public void setEmprestimoCollection(Collection<Emprestimo> emprestimoCollection) {
        this.emprestimoCollection = emprestimoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (membroId != null ? membroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membro)) {
            return false;
        }
        Membro other = (Membro) object;
        if ((this.membroId == null && other.membroId != null) || (this.membroId != null && !this.membroId.equals(other.membroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.biblioteca.controller.Membro[ membroId=" + membroId + " ]";
    }
    
}

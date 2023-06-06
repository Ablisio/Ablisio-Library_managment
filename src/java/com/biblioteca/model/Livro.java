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
@Table(name = "livro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livro.findAll", query = "SELECT l FROM Livro l")
    , @NamedQuery(name = "Livro.findByLivroId", query = "SELECT l FROM Livro l WHERE l.livroId = :livroId")
    , @NamedQuery(name = "Livro.findByTitulo", query = "SELECT l FROM Livro l WHERE l.titulo = :titulo")
    , @NamedQuery(name = "Livro.findByAutor", query = "SELECT l FROM Livro l WHERE l.autor = :autor")
    , @NamedQuery(name = "Livro.findByIsbn", query = "SELECT l FROM Livro l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Livro.findByAnoPublicacao", query = "SELECT l FROM Livro l WHERE l.anoPublicacao = :anoPublicacao")
    , @NamedQuery(name = "Livro.findByDescricao", query = "SELECT l FROM Livro l WHERE l.descricao = :descricao")
    , @NamedQuery(name = "Livro.findByQuantidadeDisponivel", query = "SELECT l FROM Livro l WHERE l.quantidadeDisponivel = :quantidadeDisponivel")
    , @NamedQuery(name = "Livro.findByCategoria", query = "SELECT l FROM Livro l WHERE l.categoria = :categoria")})
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "livro_id")
    private Integer livroId;
    @Size(max = 255)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 255)
    @Column(name = "autor")
    private String autor;
    @Size(max = 13)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "ano_publicacao")
    private Integer anoPublicacao;
    @Size(max = 255)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "quantidade_disponivel")
    private Integer quantidadeDisponivel;
    @Size(max = 50)
    @Column(name = "categoria")
    private String categoria;
    @OneToMany(mappedBy = "livroId")
    private Collection<Emprestimo> emprestimoCollection;

    public Livro() {
    }

    public Livro(Integer livroId) {
        this.livroId = livroId;
    }

    public Integer getLivroId() {
        return livroId;
    }

    public void setLivroId(Integer livroId) {
        this.livroId = livroId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        hash += (livroId != null ? livroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livro)) {
            return false;
        }
        Livro other = (Livro) object;
        if ((this.livroId == null && other.livroId != null) || (this.livroId != null && !this.livroId.equals(other.livroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.biblioteca.controller.Livro[ livroId=" + livroId + " ]";
    }
    
}

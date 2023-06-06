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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "emprestimo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emprestimo.findAll", query = "SELECT e FROM Emprestimo e")
    , @NamedQuery(name = "Emprestimo.findByEmprestimoId", query = "SELECT e FROM Emprestimo e WHERE e.emprestimoId = :emprestimoId")
    , @NamedQuery(name = "Emprestimo.findByDataEmprestimo", query = "SELECT e FROM Emprestimo e WHERE e.dataEmprestimo = :dataEmprestimo")
    , @NamedQuery(name = "Emprestimo.findByDataDevolucaoPrevista", query = "SELECT e FROM Emprestimo e WHERE e.dataDevolucaoPrevista = :dataDevolucaoPrevista")
    , @NamedQuery(name = "Emprestimo.findByDataDevolucaoReal", query = "SELECT e FROM Emprestimo e WHERE e.dataDevolucaoReal = :dataDevolucaoReal")})
public class Emprestimo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "emprestimo_id")
    private Integer emprestimoId;
    @Size(max = 255)
    @Column(name = "data_emprestimo")
    private String dataEmprestimo;
    @Size(max = 255)
    @Column(name = "data_devolucao_prevista")
    private String dataDevolucaoPrevista;
    @Size(max = 255)
    @Column(name = "data_devolucao_real")
    private String dataDevolucaoReal;
    @JoinColumn(name = "livro_id", referencedColumnName = "livro_id")
    @ManyToOne
    private Livro livroId;
    @JoinColumn(name = "membro_id", referencedColumnName = "membro_id")
    @ManyToOne
    private Membro membroId;

    public Emprestimo() {
    }

    public Emprestimo(Integer emprestimoId) {
        this.emprestimoId = emprestimoId;
    }

    public Integer getEmprestimoId() {
        return emprestimoId;
    }

    public void setEmprestimoId(Integer emprestimoId) {
        this.emprestimoId = emprestimoId;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public String getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(String dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public Livro getLivroId() {
        return livroId;
    }

    public void setLivroId(Livro livroId) {
        this.livroId = livroId;
    }

    public Membro getMembroId() {
        return membroId;
    }

    public void setMembroId(Membro membroId) {
        this.membroId = membroId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emprestimoId != null ? emprestimoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emprestimo)) {
            return false;
        }
        Emprestimo other = (Emprestimo) object;
        if ((this.emprestimoId == null && other.emprestimoId != null) || (this.emprestimoId != null && !this.emprestimoId.equals(other.emprestimoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.biblioteca.controller.Emprestimo[ emprestimoId=" + emprestimoId + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Huzeif
 */
package com.biblioteca.model;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import com.biblioteca.model.MembroBean;
import com.biblioteca.modeloDao.MembroDao;

@ManagedBean
@ViewScoped
public class MembroBean {
    public int membroId;
    public String nome;
   public String endereco;
   public String email;
   public String telefone;
    public String dataInscricao;
    public String senha;

    // Getters and Setters

    public int getMembroId() {
        return membroId;
    }

    public void setMembroId(int membroId) {
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

    public void adicionarMembro() {
        MembroBean membro = new MembroBean();
        membro.setNome(nome);
        membro.setEndereco(endereco);
        membro.setEmail(email);
        membro.setTelefone(telefone);
        membro.setDataInscricao(dataInscricao);
        membro.setSenha(senha);

        MembroDao membroDao = new MembroDao();
        membroDao.salvar(membro);

        // Limpar os campos após adicionar o membro
        nome = null;
        endereco = null;
        email = null;
        telefone = null;
        dataInscricao = null;
        senha = null;

        // Exibir mensagem de sucesso
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Membro adicionado com sucesso", null));
    }
}

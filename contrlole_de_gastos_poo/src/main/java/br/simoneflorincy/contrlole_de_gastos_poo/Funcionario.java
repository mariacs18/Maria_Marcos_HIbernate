/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

    @Column(name = "cd_funcionario")
    @Id
    private Integer codFuncionario;
    @Column(name = "cod_Funcionario")
    private Integer fucao_cd_funcao;
    @Column(name = "fucao_cd_funcao")
    private String funcao;
    @Column(name = "endereco_cd_endereco")
    private String endereco;
    @Column(name = "nm_funcionario")
    private String funcionario;
    @Column(name = "ds_senha")
    private String senha;
    @Column(name = "tp_visivel")
    private String visivel;
    private String nick;
    @Column(name = "nick")
    
    /**
     * @return the visivel
     */
    @Id
    public String getVisivel() {
        return visivel;
    }

    /**
     * @param visivel the visivel to set
     */
    public void setVisivel(String visivel) {
        this.visivel = visivel;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the funcionario
     */
    public String getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the fucao_cd_funcao
     */
    public Integer getFucao_cd_funcao() {
        return fucao_cd_funcao;
    }

    /**
     * @param fucao_cd_funcao the fucao_cd_funcao to set
     */
    public void setFucao_cd_funcao(Integer fucao_cd_funcao) {
        this.fucao_cd_funcao = fucao_cd_funcao;
    }

    /**
     * @return the codFuncionario
     */
    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
}
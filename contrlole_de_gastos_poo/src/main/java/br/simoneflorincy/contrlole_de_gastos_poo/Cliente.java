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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ciente")
public class Cliente implements Serializable {

    //cd_cliente
    @Column(name = "cd_cliente")
    @Id
    Integer codCliente;
    @Column(name = "cod_indetificacao")//(integer)
    private Integer codIdentificacao;
    @Column(name = "ds_email")
    private String email;
    @Column(name = "nm_fantasia")
    private String nomeFantasia;
    @Column(name = "nm_razaosocial")
    private String razaoSocial;
    @Column(name = "tipo_cliente")
    private String tipoCliente;
    @Column
    Character tp_visivel;
    @Column(name = "endereco_cd_endereco")
    @OneToOne(targetEntity = Endereco.class, cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private Endereco enderecoDoCliente;

    //* @return the codIdentificacao
    public Integer getCodIdentificacao() {
        return codIdentificacao;
    }

    /**
     * @param codIdentificacao the codIdentificacao to set
     */
    public void setCodIdentificacao(Integer codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the tipoCliente
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * @return the enderecoDoCliente
     */
    public Endereco getEnderecoDoCliente() {
        return enderecoDoCliente;
    }

    /**
     * @param enderecoDoCliente the enderecoDoCliente to set
     */
    public void setEnderecoDoCliente(Endereco enderecoDoCliente) {
        this.enderecoDoCliente = enderecoDoCliente;
    }

}
